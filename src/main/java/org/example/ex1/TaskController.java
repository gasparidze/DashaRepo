package org.example.ex1;

import java.util.List;

public class TaskController {
    private final TaskList taskList;
    public TaskController(TaskList taskList) {
        this.taskList = taskList;
    }
    public void add(String title) {
        taskList.addTask(title);
    }
    public void complete(String title) {
        taskList.completeTask(title);
    }

    public void completeAllContaining(String fragment) {
        TaskList.TaskIterator iterator = taskList.iterator();
        while (iterator.hasNext()){
            TaskList.Task task = iterator.next();

            if (task.getTitle().contains(fragment)){
                taskList.completeTask(task.getTitle());
            }
        }
    }

    public void addAll(List<String> titles) {
        for (String title : titles) {
            taskList.addTask(title);
        }
    }
}
