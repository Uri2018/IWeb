package telran.web.dau;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.web.entity.Person;

public interface IwebRepository extends MongoRepository<Person, String>{

}
