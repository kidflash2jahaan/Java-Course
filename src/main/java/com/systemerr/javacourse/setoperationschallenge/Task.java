package com.systemerr.javacourse.setoperationschallenge;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private String assignee;
    private String project;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;

    public Task(String assignee, String project, String description, TaskStatus status, TaskPriority priority) {
        this.assignee = assignee;
        this.project = project;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task o) {
        if (getProject().equals(o.getProject())) {
            return getDescription().compareTo(o.getDescription());
        }
        return getProject().compareTo(o.getProject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProject(), getDescription());
    }

    @Override
    public boolean equals(Object obj) {
        Task o = (Task) obj;
        return getProject().equals(o.getProject()) && getDescription().equals(o.getDescription());
    }

    @Override
    public String toString() {
        return assignee + ", " + project + ", " + description + ", " + priority + ", " + status;
    }

    public String getAssignee() {
        return assignee;
    }
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public TaskStatus getStatus() {
        return status;
    }
    public void setStatus(TaskStatus status) {
        this.status = status;
    }
    public TaskPriority getPriority() {
        return priority;
    }
    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }
}
