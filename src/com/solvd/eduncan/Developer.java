package com.solvd.eduncan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Developer extends Employee implements Skillable, Billable {
    private final List<String> skills;
    private String currentTask = "";

    public Developer(String employeeId, String name, Department department, List<String> programmingLanguages) {
        super(employeeId, name,"Developer", department);
        this.skills = programmingLanguages;
    }

    @Override
    public String toString() {
        return "Developer{programmingLanguages=" + Arrays.toString(skills.toArray()) + ", " + super.toString() + "}";

    }

    @Override
    public int hashCode() {
        return super.hashCode() + Arrays.hashCode(skills.toArray());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Developer developer = (Developer) obj;
        return Arrays.equals(skills.toArray(), developer.skills.toArray());
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

    @Override
    public void addSkill(String skill) {
        skills.add(skill);
    }

    @Override
    public void removeSkill(String skill) {
        skills.remove(skill);
    }

    @Override
    public String[] getSkills() {
        return skills.toArray(new String[skills.size()]);
    }

    @Override
    public boolean hasSkill(String skill) {
        return skills.contains(skill);
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

    @Override
    public double calculateBillableHours() {
        return 40;
    }

    @Override
    public double getHourlyRate() {
        return 35;
    }

    @Override
    public double getTotalCost() {
        return 40 * 35;
    }
}
