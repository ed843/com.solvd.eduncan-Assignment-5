package com.solvd.eduncan;

public class Department extends Company {
    private final String departmentName;

    public Department(String name, String location, String departmentName) {
        super(name, location);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + departmentName;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + departmentName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Department department = (Department) obj;
        return departmentName.equals(department.getDepartmentName());
    }
}
