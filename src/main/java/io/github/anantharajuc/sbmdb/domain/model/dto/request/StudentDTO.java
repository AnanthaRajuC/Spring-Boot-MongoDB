package io.github.anantharajuc.sbmdb.domain.model.dto.request;

import java.util.List;

import io.github.anantharajuc.sbmdb.domain.model.Demographics;
import io.github.anantharajuc.sbmdb.domain.model.Department;
import io.github.anantharajuc.sbmdb.domain.model.Hobbies;
import io.github.anantharajuc.sbmdb.domain.model.Subject;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class StudentDTO 
{
	String id;
	String name;
	String email;
	Department department;
	List<Subject> subjects;
	Demographics demographics;
	List<Hobbies> hobbies;
}
