package com.solvd.eduncan;

import java.util.ArrayList;
import java.util.List;

public class Project implements Manageable, Auditable, Reportable, Billable {
    private String projectId;
    private String projectName;
    private double budget;
    private static String auditLog;
    private String currentTask;

    public Project(String projectId, String projectName, double budget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project{projectId='" + projectId + "', projectName='" + projectName + "', budget=" + budget + "}";
    }


    @Override
    public void startAudit(String date) {
        auditLog += "\nProject " + projectId + " started at " + date;
    }

    @Override
    public void endAudit(String date) {
        auditLog += "\nProject " + projectId + " finished at " + date;
    }

    @Override
    public String getAuditLog() {
        return auditLog;
    }

    @Override
    public String generateReport() {
        return "Generating report for project " + projectId + " at " + projectName;
    }

    @Override
    public void exportReport(String format) {
        if(format.equals("pdf") || format.equals("docx") || format.equals("xls") || format.equals("xlsx"))
            System.out.println("Exporting report for project " + projectId + " at " + projectName + " in " + format + " format.");
        else
            System.out.println("Sorry, but we cannot export in that format.");
    }


    @Override
    public boolean isCompliant() {
        return false;
    }

    @Override
    public void assignTask(String task) {
        currentTask = task;
    }

    @Override
    public void reportProgress() {
        System.out.println("Still working on " + currentTask + ".");
    }

    @Override
    public String getStatus() {
        if (currentTask.equals("")) {
            return "Currently free";
        } else {
            return "Working on " + currentTask + ".";
        }
    }

    @Override
    public double calculateBillableHours() {
        return 30;
    }

    @Override
    public double getHourlyRate() {
        return 200;
    }

    @Override
    public double getTotalCost() {
        return 200 * 30;
    }
}

