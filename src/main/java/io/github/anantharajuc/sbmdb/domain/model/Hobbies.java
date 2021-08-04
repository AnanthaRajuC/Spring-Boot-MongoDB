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
@Document(collection="hobbies")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Hobbies 
{
	@Id
	String id;
	
	@Field(name="hobby_name")
	String hobbyName;
	
	@Field(name="interest_level")
	int interestLevel;
}
