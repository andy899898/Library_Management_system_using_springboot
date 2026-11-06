package com.example.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Members;

public interface MembersRepository extends JpaRepository<Members, Integer>{

}
