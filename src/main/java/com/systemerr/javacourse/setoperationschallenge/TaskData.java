package com.systemerr.javacourse.setoperationschallenge;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private static String tasksAll = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, Medium
            Data Design, Employee Table, Medium
            Data Design, Cross Reference Tables, High
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low
            Data Access, Set Up Users, Low
            Data Access, Set Up Access Policy, Low
            """;

    private static String tasksAnn = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy,Medium, In Progress
            Research, Cloud solutions, Medium, In Progress
            Data Design, Encryption Policy, High
            Data Design, Project Table, Medium
            Data Access, Write Views,Low, In Progress
            """;

    private static String tasksBob = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy, Medium
            Data Design,Encryption Policy,High
            Data Access,Write Views, Low, In Progress
            """;

    private static String tasksCarol = """
            Infrastructure, Logging, High, In Progress
            Infrastructure, DB Access, Medium
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, High
            Data Access, Write Views, Low
            """;

    public static Set<Task> getTasks(String assignee) {
        String tasksSelected;
        switch (assignee.toLowerCase()) {
            case "ann":
                tasksSelected = tasksAnn;
                break;
            case "bob":
                tasksSelected = tasksBob;
                break;
            case "carol":
                tasksSelected = tasksCarol;
                break;
            default:
                tasksSelected = tasksAll;
                break;
        }
        String[] tasksList = tasksSelected.split("\n");
        Set<Task> tasks = new HashSet<>();
        for (String taskString : tasksList) {
            String[] parts = taskString.split(",");

            String project = parts[0].trim();

            String description = parts[1].trim();

            TaskPriority priority;
            switch (parts[2].trim()) {
                case "High":
                    priority = TaskPriority.HIGH;
                    break;
                case "Medium":
                    priority = TaskPriority.MEDIUM;
                    break;
                default:
                    priority = TaskPriority.LOW;
                    break;
            }

            TaskStatus status;
            if (parts.length == 3) {
                status = TaskStatus.INQUEUE;
            } else {
                status = TaskStatus.INPROGRESS;
            }

            tasks.add(new Task(assignee.toLowerCase(), project, description, status, priority));
        }
        return tasks;
    }
}
