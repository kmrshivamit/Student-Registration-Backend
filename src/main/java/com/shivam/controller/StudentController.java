package com.shivam.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.dto.StudentDTO;
import com.shivam.model.Student;
import com.shivam.repo.StudentRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/student")
	List<StudentDTO> findAll() {
		List<Student> list = studentRepo.findAll();
		List<StudentDTO> dtoList = list.stream().map(student -> this.convertToDTO(student))
				.collect(Collectors.toList());
		return dtoList;
	}

	@PostMapping("/student")
	Student save( @RequestBody StudentDTO student) {
		Student studentEntity=this.convertToEntity(student);
		System.out.println(studentEntity);
		return studentRepo.save(this.convertToEntity(student));
	}

	private Student convertToEntity(StudentDTO studentDTO) {
		Student student = modelMapper.map(studentDTO, Student.class);
		return student;
	}

	private StudentDTO convertToDTO(Student student) {
		StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);

		return studentDTO;
	}
}
