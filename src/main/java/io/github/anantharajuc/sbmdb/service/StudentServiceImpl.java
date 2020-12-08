package io.github.anantharajuc.sbmdb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.anantharajuc.sbmdb.exception.ResourceNotFoundException;
import io.github.anantharajuc.sbmdb.model.Student;
import io.github.anantharajuc.sbmdb.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student student) 
	{
		return studentRepository.save(student); 
	}

	@Override
	public Student findStudentById(String id) 
	{
		return studentRepository
				.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
	}

	@Override
	public List<Student> findAllStudents() 
	{
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(String id, Student studentDetails) 
	{
		Student student = studentRepository
							.findById(id)
							.orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));

		student.setDepartment(studentDetails.getDepartment());
		student.setEmail(studentDetails.getEmail());
		student.setName(studentDetails.getName());
		student.setSubjects(studentDetails.getSubjects());
			
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(String id) 
	{
		if(studentRepository.existsById(id))
		{
			studentRepository.deleteById(id);
		}
		else 
		{
			throw new ResourceNotFoundException("Student", "id", id);
		}
	}

	@Override
	public List<Student> findStudentByName(String name) 
	{
		return studentRepository.findByName(name);
	}
}
