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

import com.shivam.dto.CourseDTO;
import com.shivam.model.Course;
import com.shivam.repo.CourseRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CourseController {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	CourseRepo courseRepo;

	@GetMapping("/course")
	List<CourseDTO> findAll() {
		return courseRepo.findAll().stream().map(course -> this.convertToDTO(course)).collect(Collectors.toList());
	}

	@PostMapping("/course")
	Course save(@Valid @RequestBody CourseDTO course) {
		return courseRepo.save(this.convertToEntity(course));
	}

	Course convertToEntity(CourseDTO courseDTO) {
		return modelMapper.map(courseDTO, Course.class);
	}

	CourseDTO convertToDTO(Course course) {
		return modelMapper.map(course, CourseDTO.class);
	}

}
