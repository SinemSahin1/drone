package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) { this.repo = repo; }

    public User register(User user) {
        repo.findByEmail(user.getEmail()).ifPresent(u -> {
            throw new RuntimeException("Bu email zaten kayıtlı!");
        });
        return repo.save(user);
    }

    public User login(String email, String rawPassword) {
        User u = repo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Email veya şifre hatalı!"));
        if (!u.getPassword().equals(rawPassword)) {
            throw new RuntimeException("Email veya şifre hatalı!");
        }
        return u;
    }
}
