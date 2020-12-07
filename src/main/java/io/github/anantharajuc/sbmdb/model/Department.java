package io.github.anantharajuc.sbmdb.model;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Department 
{
	@Field(name="department_name")
	String departmentName;
	
	@Field(name="location")
	String location;
}
