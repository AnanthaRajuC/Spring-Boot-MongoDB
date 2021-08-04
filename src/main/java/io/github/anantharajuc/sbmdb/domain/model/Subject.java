package io.github.anantharajuc.sbmdb.domain.model;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Subject 
{
	@Field(name="subject_name")
	String subjectName;
	
	@Field(name="marks_obtained")
	int marksObtained;
}
