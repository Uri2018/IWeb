package telran.web.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@Document(collection="Web")
public class Person {
	
	@Id
String id;
String firstname;
String lastname;
@JsonFormat(pattern="yyyy-MM-dd'T'hh:mm:ss")
LocalDateTime createdTime;
public Person( String firstname, String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
	
	createdTime=LocalDateTime.now();
}


}
