package com.example.estude.repository;

import com.example.estude.model.Student;
import com.example.estude.repository.IStudentRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;


@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    IStudentRepository repository;

    @Test
    void DeveriaCarregarEstudantePeloId() {
        int idStudent = 1;
        Optional<Student> students = repository.findById(idStudent);
        Assert.assertEquals(students.isPresent(), true);

    }


}
