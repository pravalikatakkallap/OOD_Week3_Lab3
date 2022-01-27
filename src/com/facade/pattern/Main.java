package com.facade.pattern;

public class Main {
    public static void main(String[] args) {
        ProjectTeam team = new ProjectTeam();

        team.programmer();
        team.qa();
        team.projectManager();
    }
}
