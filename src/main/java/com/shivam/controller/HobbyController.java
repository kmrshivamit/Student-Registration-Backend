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

import com.shivam.dto.HobbyDTO;
import com.shivam.dto.QualificationDTO;
import com.shivam.model.Hobby;
import com.shivam.model.Qualification;
import com.shivam.repo.HobbyRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HobbyController {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	HobbyRepo hobbyRepo;

	@GetMapping("/hobby")
	List<HobbyDTO> findAll() {
		return hobbyRepo.findAll().stream().map(hobby -> this.convertToDTO(hobby)).collect(Collectors.toList());
	}

	@PostMapping("/hobby")
	Hobby save(@Valid @RequestBody HobbyDTO hobby) {
		return hobbyRepo.save(this.convertToEntity(hobby));
	}

	private Hobby convertToEntity(HobbyDTO hobbyDTO) {
		Hobby hobby = modelMapper.map(hobbyDTO, Hobby.class);
		return hobby;
	}

	private HobbyDTO convertToDTO(Hobby hobby) {
		HobbyDTO hobbyDTO = modelMapper.map(hobby, HobbyDTO.class);
		return hobbyDTO;
	}
}
