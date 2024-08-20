package com.solvd.eduncan;

import java.util.concurrent.TimeUnit;

public final class Manager extends Employee implements Reportable{
    private String availability;
    private String currentTask;

    public Manager(String employeeId, String name, Department department, String availability) {
        super(employeeId, name, "Manager", department);
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }


    public void performDuties() {
        System.out.println("Performing managing...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
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
        if (currentTask.isEmpty()) {
            return "Currently free";
        } else {
            return "Working on " + currentTask + ".";
        }
    }

    public void approveVacation(Employee employee, int days) {
        // Logic to approve vacation
        System.out.println("Vacation approved for " + employee.getName() + " for " + days + " days.");
    }

    @Override
    public String generateReport() {
        return "Generating report for manager " + getEmployeeId() + ".";
    }

    public void exportReport(String format) {
        if(format.equals("pdf") || format.equals("docx") || format.equals("xls") || format.equals("xlsx"))
            System.out.println("Exporting report for project " + getName() + " at " + getDepartment().toString() + " in " + format + " format.");
        else
            System.out.println("Sorry, but we cannot export in that format.");
    }
}
