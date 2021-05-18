package io.github.anantharajuc.sbmdb.model;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
	
	@Size(min=3, max=15, message="Name must be between 3 and 15 characters.")
	@ApiModelProperty(position=1, notes="Name of the student, it must be between 3 and 15 characters.", value="${Student.name}", example="John Doe")
	@Field(name="name")
	String name;
	
	@Field(name="mail")
	String email;
	
	@Field(name="department")
	Department department;
	
	List<Subject> subjects;
	
	@DBRef
	Demographics demographics;
	
	@DBRef
	List<Hobbies> hobbies;
}
