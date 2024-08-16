package com.solvd.eduncan;

import java.util.concurrent.TimeUnit;

public class Manager extends Employee {
    private String availability;

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


}
