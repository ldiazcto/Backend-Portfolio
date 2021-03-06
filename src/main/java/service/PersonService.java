package service;

import model.Person;
import repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    @Autowired
    public PersonRepository personRepo;

    @Override
    public List<Person> get_person() {
        return personRepo.findAll();
    }

    @Override
    public void add_person(Person person) {
        personRepo.save(person);
    }

    @Override
    public void delete_person(Long id) {
        personRepo.deleteById(id);
    }

    @Override
    public Person find_person(Long id) {
        return personRepo.findById(id).orElse(null);
    }

    @Override
    public void edit_person(Long id) {

    }

}
