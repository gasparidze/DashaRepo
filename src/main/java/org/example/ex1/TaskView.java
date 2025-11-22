package org.example.ex1;

public class TaskView implements TaskList.Listener{
    @Override
    public void onTaskAdded(TaskList.Task task) {
        System.out.println(task + " is added");
    }

    @Override
    public void onTaskCompleted(TaskList.Task task) {
        System.out.println(task + " task was completed");
    }
}
