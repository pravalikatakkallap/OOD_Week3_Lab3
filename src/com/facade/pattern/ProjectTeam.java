package com.facade.pattern;

public class ProjectTeam {
    private Programmer programmer;
    private ProjectManager projectManager;
    private QA qa;

    public ProjectTeam() {
        this.programmer = new Programmer();
        this.projectManager = new ProjectManager();
        this.qa = new QA();
    }

    public void programmer() {
        programmer.tellDesignation();
    }

    public void qa() {
        qa.tellDesignation();
    }

    public void projectManager() {
        projectManager.tellDesignation();
    }
}
