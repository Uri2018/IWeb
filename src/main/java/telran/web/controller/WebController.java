package telran.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.web.dto.NewUpdatePerson;
import telran.web.entity.Person;
import telran.web.service.WebService;

@RestController
public class WebController {
@Autowired
WebService webservice;
@PostMapping("/web")
Person addnewPerson( @RequestBody
		Person person) {
	return webservice.addnewPerson(person);
	
}
@PutMapping("/web/{id}")
Person updatePerson(
	@PathVariable	String id,
@RequestBody	NewUpdatePerson update)
{
	return webservice.updatePerson(id, update);
	
}
@DeleteMapping("/web/{id}")
Person removePerson( @PathVariable String id)
{
	return webservice.removePerson(id);
}
@GetMapping("/web/{id}")
Person getPerson( @PathVariable String id)
{
	return webservice.getPerson(id);
	
}
}
