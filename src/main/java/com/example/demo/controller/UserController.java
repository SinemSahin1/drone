package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")

@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/register")
  public Map<String, String> register(@RequestBody User user) {
    User saved = userService.register(user);

    String token = JwtUtil.generateToken(saved.getEmail());
    return Map.of("message", "Kayıt başarılı", "token", token, "email", saved.getEmail());
  }

  @PostMapping("/login")
  public Map<String, String> login(@RequestBody User user) {
    User logged = userService.login(user.getEmail(), user.getPassword());
    String token = JwtUtil.generateToken(logged.getEmail());
    return Map.of("message", "Giriş başarılı", "token", token, "email", logged.getEmail());
  }

  @GetMapping("/secure")
  public String secure(@RequestHeader("Authorization") String authHeader) {
    try {
      String token = authHeader.replace("Bearer ", "");
      String email = JwtUtil.validateToken(token);
      return "Hoş geldin " + email + "! Token doğrulandı ✅";
    } catch (Exception e) {
      return "❌ Token geçersiz veya süresi dolmuş!";
    }
  }
}
