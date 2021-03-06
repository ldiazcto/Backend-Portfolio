package service;

import model.Skill;

import java.util.List;

public interface ISkillService {

    public List<Skill> get_skills();

    public void add_skill(Skill skill);

    public void delete_skill(Long id);

    public Skill find_skill(Long id);

    public void edit_skill(Long id);
}