package dao;

import metier.Project;

import java.util.List;

public interface IProjet {
    public Project saveProject(Project p);
    public List<Project> afficherProject();
    public Project getProject(int id);
    public Project updateProject(Project p);
    public void deleteProject(int projet_id);

}
