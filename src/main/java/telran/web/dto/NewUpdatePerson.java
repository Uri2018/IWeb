package telran.web.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class NewUpdatePerson {
String firstname;
String lastname;
@JsonFormat(pattern="yyyy-MM-dd'T'hh:mm:ss")
LocalDateTime updateTime;

public NewUpdatePerson(String firstname, String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
	updateTime=LocalDateTime.now();
}




}
