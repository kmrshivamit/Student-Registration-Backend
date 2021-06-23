package com.shivam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.model.Hobby;

public interface HobbyRepo extends JpaRepository<Hobby, Long>{

}
