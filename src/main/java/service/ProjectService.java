package service;

import model.Project;
import repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService{

    @Autowired
    public ProjectRepository projectRepo;

    @Override
    public List<Project> get_project() {
        return projectRepo.findAll();
    }

    @Override
    public void add_project(Project project) {
        projectRepo.save(project);
    }

    @Override
    public void delete_project(Long id) {
        projectRepo.deleteById(id);
    }

    @Override
    public Project find_project(Long id) {
        return projectRepo.findById(id).orElse(null);
    }

    @Override
    public void edit_project(Long id) {
    }
}

