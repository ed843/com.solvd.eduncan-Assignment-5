package com.solvd.eduncan;

import java.util.Arrays;

public class Client {
    private final String clientId;
    private String name;
    private String industry;
    private Project[] currentClientProjects;
    private Project[] pastClientProjects;

    public Client(String clientId, String name, String industry, Project[] currentClientProjects, Project[] pastClientProjects) {
        this.clientId = clientId;
        this.name = name;
        this.industry = industry;
        this.currentClientProjects = currentClientProjects;
        this.pastClientProjects = pastClientProjects;
    }

    public String getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public Project[] getClientProject() {
        return currentClientProjects;
    }

    public void setClientName(String clientName) {
        this.name = clientName;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setClientProject(Project[] currentClientProjects) {
        this.currentClientProjects = currentClientProjects;
    }

    public void setPastClientProject(Project[] pastClientProjects) {
        this.pastClientProjects = pastClientProjects;
    }

    @Override
    public String toString() {
        return clientId + " " + name + " " + industry + "\n" + Arrays.toString(currentClientProjects) + "\n" + Arrays.toString(pastClientProjects) ;
    }

}
