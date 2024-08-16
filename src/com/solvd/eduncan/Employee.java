package com.solvd.eduncan;

public abstract class Employee {
    private String employeeId;
    private String name;
    private String position;
    private Department department;

    public Employee(String employeeId, String name, String position, Department department) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.department = department;
    }

    String getEmployeeId() {
        return employeeId;
    }

    void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
    String getPosition() {
        return position;
    }
    void setPosition(String position) {
        this.position = position;
    }
    Department getDepartment() {
        return department;
    }

    void setDepartment(Department department) {
        this.department = department;
    }

    // Abstract method
    public abstract void performDuties();

    @Override
    public String toString() {
        return "Employee{employeeId='" + employeeId + "', name='" + name + "', position='" + position + "'}";
    }
}

