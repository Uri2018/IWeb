package telran.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import telran.web.dau.IwebRepository;
import telran.web.dto.NewUpdatePerson;
import telran.web.entity.Person;
@Service
public class WebServiceimpl implements WebService{
@Autowired
	IwebRepository repository;

@Override
public Person addnewPerson(Person person) {
	Person res=new Person(person.getFirstname(),person.getLastname());
	repository.save(res);
	return res;
}

@Override
public Person updatePerson(String id,NewUpdatePerson update) {
	Person res=repository.findById(id).orElse(null);
	if(res!=null)
	{
		if(res!=null)
		{
			res.setFirstname(update.getFirstname());
			res.setLastname(update.getLastname());
			repository.save(res);
		}
	}
	return res;
}

@Override
public Person removePerson(String id) {
	Person res=repository.findById(id).orElse(null);
	if(res!=null)
	{
		repository.deleteById(id);
	}
	return res;
}

@Override
public Person getPerson(String id) {
	Person res=repository.findById(id).orElse(null);
	return res;
}
	
}
