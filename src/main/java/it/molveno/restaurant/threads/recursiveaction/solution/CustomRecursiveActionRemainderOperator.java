package it.molveno.restaurant.threads.recursiveaction.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Stream;

public class CustomRecursiveActionRemainderOperator extends RecursiveAction {

    private static final Logger logger = LoggerFactory.getLogger(CustomRecursiveActionRemainderOperator.class);

    private String workload;
    private static final int THRESHOLD = 4;


    public CustomRecursiveActionRemainderOperator(String workload) {
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

    private List<CustomRecursiveActionRemainderOperator> createSubtasks() {
        List<CustomRecursiveActionRemainderOperator> subtasks = new ArrayList<>();

        String partOne = workload.substring(0, workload.length() / 2);
        String partTwo = workload.substring(workload.length() / 2, workload.length());

        subtasks.add(new CustomRecursiveActionRemainderOperator(partOne));
        subtasks.add(new CustomRecursiveActionRemainderOperator(partTwo));

        return subtasks;
    }

    private void processing(String work) {
        String result = "";
        for (int i = 0;i<work.length();i++) {

            int element = Integer.parseInt(""+work.charAt(i));
            if (element % 2 == 0) {
                result += element;
            }
        }


        System.out.println(("This result - (" + result + ") - was processed by "
                + Thread.currentThread().getName()));
    }
}