package io.github.anantharajuc.sbmdb.domain.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Simple JavaBean domain object representing a student.
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
@Document(collection="student")
@ApiModel(description="Simple JavaBean domain object representing a student") 
public class Student
{
	@Id
	String id;
	
	@Size(min=3, max=15)
	@Schema(description="Name of the student.", example="John Doe", required=true)
	@Field(name="name")
	String name;
	
	@Schema(description="Email address of the student.",  example="example@domain.com", required=false)
	@Email(message="Email Address")
	@Field(name="mail")
	String email;
	
	@Schema(description="department to which the student belongs to",  example="Computer Science", required=false)
	@Field(name="department")
	Department department;
	
	List<Subject> subjects;
	
	@DBRef
	Demographics demographics;
	
	@DBRef
	List<Hobbies> hobbies;
}
