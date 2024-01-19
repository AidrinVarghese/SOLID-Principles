package com.ilp.entity;

public class Issue {
    private String description;
    private boolean resolved;

    public Issue(String description) {
        this.description = description;
        this.resolved = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void resolveIssue(boolean resolved) {
        this.resolved = resolved;
    }
}