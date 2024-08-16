package com.solvd.eduncan;

public class Project {
    private String projectId;
    private String projectName;
    private double budget;

    public Project(String projectId, String projectName, double budget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project{projectId='" + projectId + "', projectName='" + projectName + "', budget=" + budget + "}";
    }


}

