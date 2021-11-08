package com.example.estude.repository;

import com.example.estude.dto.AddressRequest;
import com.example.estude.dto.AddressResponse;
import com.example.estude.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByNameContaining(String name);
    Page<Student> findByNameContaining(String name, Pageable paginacao);

    
    
}
