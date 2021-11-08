package com.example.estude.repository;

import com.example.estude.model.Student;
import com.example.estude.model.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    IUserRepository repository;

    @Test
    void DeveriaCarregarUsuarioPeloId() {
        int idStudent = 36;
        Optional<User> user = repository.findById(idStudent);
        Assert.assertEquals(user.isPresent(), true);

    }
}
