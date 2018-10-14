package telran.web.service;

import telran.web.dto.NewUpdatePerson;
import telran.web.entity.Person;

public interface WebService {
Person addnewPerson(Person person);
Person updatePerson(String id,NewUpdatePerson update);
Person removePerson(String id);
Person getPerson(String id); 
}
