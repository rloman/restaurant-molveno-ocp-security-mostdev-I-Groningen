package it.molveno.restaurant.threads.recursiveaction.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class CustomRecursiveActionString extends RecursiveAction {

    private String workload = "";
    private static final int THRESHOLD = 2;


    public CustomRecursiveActionString(String workload) {
        this.workload = workload;
    }

    @Override
    protected void compute() {
        if (workload.length() > THRESHOLD) {
            ForkJoinTask.invokeAll(createSubtasks());
        } else {
            processing(workload);
        }
    }

    private List<CustomRecursiveActionString> createSubtasks() {
        List<CustomRecursiveActionString> subtasks = new ArrayList<>();

        String partOne = workload.substring(0, workload.length() / 2);
        String partTwo = workload.substring(workload.length() / 2, workload.length());

        subtasks.add(new CustomRecursiveActionString(partOne)); //1
        subtasks.add(new CustomRecursiveActionString(partTwo)); //2

        return subtasks;
    }

    private void processing(String work) {
        String result = work.toUpperCase();
        System.out.println(("This result - (" + result + ") - was processed by "
                + Thread.currentThread().getName()));
    }
}