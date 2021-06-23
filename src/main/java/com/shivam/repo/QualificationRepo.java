package com.shivam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.model.Qualification;

public interface QualificationRepo extends JpaRepository<Qualification, Long> {

}
