package io.github.anantharajuc.sbmdb.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbmdb.api.ResourcePaths;
import io.github.anantharajuc.sbmdb.model.Student;
import io.github.anantharajuc.sbmdb.model.dto.StudentDTO;
import io.github.anantharajuc.sbmdb.service.StudentServiceImpl;

/*
 * Student Command Controller
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@RestController
@RequestMapping(value=ResourcePaths.Student.V1.ROOT)
public class StudentCommandController 
{
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@Autowired
	ModelMapper modelMapper;
	
	@PostMapping()
	public Student createStudent(@RequestBody StudentDTO studentDTO)
	{
		Student student = modelMapper.map(studentDTO, Student.class);
		
		return studentServiceImpl.createStudent(student); 
	}

	@PutMapping()
	public Student updateStudent(@RequestBody StudentDTO studentDTO)
	{
		Student student = modelMapper.map(studentDTO, Student.class);
		
		return studentServiceImpl.updateStudent(student);
	}

	@DeleteMapping(value=ResourcePaths.ID)
	public void deleteStudentById(@PathVariable String id)
	{
		studentServiceImpl.deleteStudentById(id);
	}
}
