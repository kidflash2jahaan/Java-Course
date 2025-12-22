package com.systemerr.javacourse.setoperationschallenge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Task> fullTaskList = getUnion(List.of(
            TaskData.getTasks("ann"),
            TaskData.getTasks("bob"),
            TaskData.getTasks("carol"),
            TaskData.getTasks("all")
        ));
        fullTaskList.forEach(System.out::println);
        System.out.println();

        Set<Task> assignedTaskList = getUnion(List.of(
            TaskData.getTasks("ann"),
            TaskData.getTasks("bob"),
            TaskData.getTasks("carol")
        ));
        assignedTaskList.forEach(System.out::println);
        System.out.println();

        Set<Task> unassignedTaskList = getDifference(fullTaskList, assignedTaskList);
        unassignedTaskList.forEach(System.out::println);
        System.out.println();

        Set<Task> multipleAssignedTaskList = getUnion(List.of(
            getIntersect(TaskData.getTasks("ann"), TaskData.getTasks("bob")),
            getIntersect(TaskData.getTasks("ann"), TaskData.getTasks("carol")),
            getIntersect(TaskData.getTasks("bob"), TaskData.getTasks("carol"))
        ));
        multipleAssignedTaskList.forEach(System.out::println);
        System.out.println();
    }

    public static Set<Task> getUnion(List<Set<Task>> sets) {
        Set<Task> result = new HashSet<>();
        sets.forEach(result::addAll);
        return result;
    }

    public static Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
