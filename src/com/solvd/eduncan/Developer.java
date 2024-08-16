package com.solvd.eduncan;

import java.util.Arrays;

public class Developer extends Employee {
    private final String[] programmingLanguages;

    public Developer(String employeeId, String name, Department department, String[] programmingLanguages) {
        super(employeeId, name,"Developer", department);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return "Developer{programmingLanguages=" + Arrays.toString(programmingLanguages) + ", " + super.toString() + "}";

    }

    @Override
    public int hashCode() {
        return super.hashCode() + Arrays.hashCode(programmingLanguages);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Developer developer = (Developer) obj;
        return Arrays.equals(programmingLanguages, developer.programmingLanguages);
    }

    public void performDuties() {
        System.out.println("Performing coding...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
