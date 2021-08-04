package io.github.anantharajuc.sbmdb.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import io.github.anantharajuc.sbmdb.domain.model.Demographics;
import io.github.anantharajuc.sbmdb.domain.model.Hobbies;
import io.github.anantharajuc.sbmdb.domain.model.Student;
import io.github.anantharajuc.sbmdb.domain.model.Subject;
import io.github.anantharajuc.sbmdb.infra.exception.ResourceNotFoundException;
import io.github.anantharajuc.sbmdb.repository.DemographicsRepository;
import io.github.anantharajuc.sbmdb.repository.HobbiesRepository;
import io.github.anantharajuc.sbmdb.repository.StudentRepository;
import io.github.anantharajuc.sbmdb.service.StudentService;
import lombok.extern.log4j.Log4j2;

/*
 * Student Service Implementation.
 * 
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
@Log4j2
@Service
public class StudentServiceImpl implements StudentService
{
	private static final String STUDENT = "student";  
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	DemographicsRepository demographicsRepository;
	
	@Autowired
	HobbiesRepository hobbiesRepository;
	
	@Override
	public Student createStudent(Student student) 
	{	
		if(student.getDemographics() != null)
		{
			log.info("demographicsRepository is-not-null check");	

			demographicsRepository.save(student.getDemographics());
		}
		
		if(student.getHobbies()!= null && !student.getHobbies().isEmpty())
		{
			hobbiesRepository.saveAll(student.getHobbies());
		}
		
		return studentRepository.save(student); 
	}

	@Override
	public Student findStudentById(String id) 
	{
		log.info("-----> findStudentById service");
		
		return studentRepository
				.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(STUDENT, "id", id));
	}

	@Override
	public List<Student> findAllStudents() 
	{
		log.info("-----> findAllStudents service");
		
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(String id, Student studentDetails) 
	{
		log.info("-----> updateStudent service");
		
		Student student = studentRepository
							.findById(id)
							.orElseThrow(() -> new ResourceNotFoundException(STUDENT, "id", id));

		student.setDepartment(studentDetails.getDepartment());
		student.setEmail(studentDetails.getEmail());
		student.setName(studentDetails.getName());
		student.setSubjects(studentDetails.getSubjects());
			
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(String id) 
	{
		log.info("-----> deleteStudentById service");
		
		if(studentRepository.existsById(id))
		{
			studentRepository.deleteById(id);
		}
		else 
		{
			throw new ResourceNotFoundException(STUDENT, "id", id);
		}
	}

	@Override
	public List<Student> findStudentByName(String name) 
	{
		log.info("-----> findStudentByName service");
		
		return studentRepository.findByName(name);
	}
	
	@Override
	public List<Student> nativeQueryFindByName(String name) 
	{
		log.info("-----> nativeQueryFindByName service");
		
		return studentRepository.nativeQueryFindByName(name);
	}

	@Override
	public List<Student> findAllStudentsPagination(int pageNo, int pageSize) 
	{
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return studentRepository.findAll(pageable).getContent();
	}

	@Override
	public List<Student> findStudentByDepartmentName(String departmentName) 
	{
		return studentRepository.findByDepartmentDepartmentName(departmentName);
	}

	@Override
	public List<Student> findAllStudentsSorting(String direction, String properties) 
	{
		log.info("-----> findAllStudentsSorting service");

		Direction d = Sort.Direction.DESC; //ASC DESC
		
		if(direction.equalsIgnoreCase("ASC"))
		{
			d = Sort.Direction.ASC;
		}

		Sort sort = Sort.by(d, properties);

		return studentRepository.findAll(sort);
	}

	@Override
	public Demographics findStudentDemographics(String id)  
	{
		log.info("-----> findStudentDemographics service");
		
		Student student = studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(STUDENT, "id", id));
		
		return student.getDemographics();
	}

	@Override
	public List<Subject> findStudentSubjects(String id) 
	{
		log.info("-----> findStudentSubjects service");
		
		Student student = studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(STUDENT, "id", id));
		
		return student.getSubjects();
	}

	@Override
	public List<Hobbies> findStudentHobbies(String id) 
	{
		log.info("-----> findStudentHobbies service");
		
		Student student = studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(STUDENT, "id", id));

		return student.getHobbies();
	}
}
