package service;
import model.Skill;
import repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements ISkillService{

    @Autowired
    public SkillRepository skillRepo;

    @Override
    public List<Skill> get_skills() {
        return skillRepo.findAll();
    }

    @Override
    public void add_skill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void delete_skill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill find_skill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void edit_skill(Long id) {
    }
}
