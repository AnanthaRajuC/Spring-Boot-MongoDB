package io.github.anantharajuc.sbmdb.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Document(collection="demographics")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Demographics 
{
	@Id
	String id;
	
	@Field(name="country")
	String country;
	
	@Field(name="age")
	int age;
}
