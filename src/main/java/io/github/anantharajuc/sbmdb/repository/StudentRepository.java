package io.github.anantharajuc.sbmdb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.sbmdb.domain.model.Student;

/**
 * 
 * Repository class for <code>Student</code> domain object. 
 * 
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, String>
{
	@Query("{\"name\":\"?0\"}")
	List<Student> nativeQueryFindByName(String name);
	
	List<Student> findByName(String name);
	
	List<Student> findByNameAndEmail(String name, String email);
	
	List<Student> findByNameOrEmail(String name, String email);
	
	List<Student> findByNameContaining(String text);
	
	/**
	 * Get document by Sub Document Field. 
	 */
	List<Student> findByDepartmentDepartmentName(String departmentName);
}
