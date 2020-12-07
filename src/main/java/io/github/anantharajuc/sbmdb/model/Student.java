package io.github.anantharajuc.sbmdb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
@Document(collection="student")
public class Student 
{
	@Id
	String id;
	
	@Field(name="name")
	String name;
	
	@Field(name="mail")
	String email;
	
	@Field(name="department")
	Department department;
	
	List<Subject> subjects;
}
