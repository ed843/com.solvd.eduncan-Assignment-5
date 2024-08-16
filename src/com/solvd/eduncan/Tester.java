package com.solvd.eduncan;

public class Tester extends Employee {
    private final String testingTools;

    public Tester(String employeeId, String name, String position, String testingTools) {
        super(employeeId, name, position);
        this.testingTools = testingTools;
    }

    public void performDuties() {
        System.out.println("Performing coding...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Done!");
    }

}
