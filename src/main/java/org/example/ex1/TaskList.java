package org.example.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {
    private final List<Task> tasks = new ArrayList<>();
    private final List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }
    private void notifyTaskAdded(Task task) {
        for (Listener listener : listeners) {
            listener.onTaskAdded(task);
        }
    }
    private void notifyTaskCompleted(Task task) {
        listeners.stream().forEach(listener -> listener.onTaskCompleted(task));
    }

    public void addTask(String title) {
        Task newTask = new Task(title);
        tasks.add(newTask);
        notifyTaskAdded(newTask);
    }

    public void completeTask(String title) {
        for (Task task : tasks) {
            if (!task.isDone()){
                task.markDone();
                notifyTaskCompleted(task);
            } else {
                System.out.println("no such elements");
            }
        }
    }

    public static class Task {
        private final String title;
        private boolean done;

        public Task(String title) {
            this.title = title;
            done = false;
        }

        public String getTitle() {
            return title;
        }

        public boolean isDone() {
            return done;
        }

        public void markDone() {
            done = true;
        }
    }

    public interface Listener {
        void onTaskAdded(Task task);
        void onTaskCompleted(Task task);
    }

    public class TaskIterator {
        private int currentPosition = 0;
        public boolean hasNext() {
            return currentPosition < tasks.size();
        }
        public Task next() {
            if (!hasNext()) {
                // Можно бросить исключение, если следующего элемента нет
                throw new java.util.NoSuchElementException("No more tasks available");
            }

            // Получаем следующий элемент и увеличиваем позицию
            Task nextTask = tasks.get(currentPosition);
            currentPosition++;

            return nextTask;
        }
    }
    public TaskIterator iterator() {
        return new TaskIterator();
    }
}
