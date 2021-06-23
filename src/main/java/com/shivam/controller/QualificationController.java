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

import com.shivam.dto.QualificationDTO;
import com.shivam.model.Qualification;
import com.shivam.repo.QualificationRepo;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class QualificationController {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private QualificationRepo qualificationRepo;

	@GetMapping("/qualification")
	List<QualificationDTO> findAll() {
		return qualificationRepo.findAll().stream().map(qualification -> this.convertToDTO(qualification))
				.collect(Collectors.toList());
	}

	@PostMapping("/qualification")
	Qualification save(@Valid @RequestBody QualificationDTO qualificationDTO) {
		return qualificationRepo.save(this.convertToEntity(qualificationDTO));
	}

	private Qualification convertToEntity(QualificationDTO qualificationDTO) {
		Qualification qualification = modelMapper.map(qualificationDTO, Qualification.class);
		return qualification;
	}

	private QualificationDTO convertToDTO(Qualification qualification) {
		QualificationDTO qualificationDTO = modelMapper.map(qualification, QualificationDTO.class);
		return qualificationDTO;
	}
}
