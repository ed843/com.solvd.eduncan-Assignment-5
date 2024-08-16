package com.solvd.eduncan;

public class Company {
    private final String name;
    private final String location;

    public Company(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "Company [name=" + name + ", location=" + location + "]";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + location.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Company company = (Company) obj;
        return name.equals(company.name) && location.equals(company.location);
    }
}

