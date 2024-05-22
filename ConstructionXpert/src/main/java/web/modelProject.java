package web;

import metier.Project;

import java.util.ArrayList;
import java.util.List;

public class modelProject {
    private List projects = new ArrayList<Project>();

    public List getProjects() {
        return projects;
    }

    public void setProjects(List projects) {        this.projects = projects;
    }
}
