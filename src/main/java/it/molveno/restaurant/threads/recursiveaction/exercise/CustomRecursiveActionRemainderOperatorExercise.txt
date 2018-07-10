package it.molveno.restaurant.threads.recursiveaction.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

// do the same as the demo for String but handle a List with String and print only the even numbers
public class CustomRecursiveActionRemainderOperatorExercise extends RecursiveAction {

    private static final Logger logger = LoggerFactory.getLogger(CustomRecursiveActionRemainderOperatorExercise.class);

    private String workload;
    private static final int THRESHOLD = 4;


    public CustomRecursiveActionRemainderOperatorExercise(String workload) {
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

    private List<CustomRecursiveActionRemainderOperatorExercise> createSubtasks() {
        List<CustomRecursiveActionRemainderOperatorExercise> subtasks = new ArrayList<>();

        .....


        return subtasks;
    }

    private void processing(String work) {
        String result = "";
        for (int i = 0; i < work.length(); i++) {
            int element = Integer.parseInt("" + work.charAt(i));
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }

        ...

    }
}