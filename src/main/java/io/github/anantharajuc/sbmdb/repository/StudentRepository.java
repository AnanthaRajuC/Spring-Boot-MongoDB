package io.github.anantharajuc.sbmdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.sbmdb.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>
{
	List<Student> findByName(String name);
	
	List<Student> findByNameAndEmail(String name, String email);
	
	List<Student> findByNameOrEmail(String name, String email);
	
	List<Student> findByNameContaining(String text);
}
