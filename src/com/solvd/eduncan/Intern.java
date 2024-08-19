package com.solvd.eduncan;

public class Intern extends Employee {
    private String schoolName;
    private String major;

    public Intern(String employeeId, String name, Department department, String schoolName, String major) {
        super(employeeId, name, "Intern", department);
        this.schoolName = schoolName;
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void performDuties() {
        System.out.println("Performing interning...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("CrowdStrike Patch Done!");
    }

    @Override
    public String toString() {
        return "Intern{schoolName='" + schoolName + "', major='" + major + "', " + super.toString() + "}";
    }

}
