package com.pravin.spring_security_learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.spring_security_learning.service.NotesService;
@RestController
public class NotesController {

  private final NotesService notesService;
  
  
  public NotesController (NotesService notesService) {
    this.notesService = notesService;
  }

  @GetMapping("/")
  public String hello() {
    return notesService.sayHello();
  }
      @GetMapping("/admin")
      public String admin() {
        return "admin"; // admin.html (optional)
      }

    
    @GetMapping("/api/user")
    public String userAccess() {
        return "Welcome USER - You are authenticated!";
    }

    @GetMapping("/api/admin")
    public String adminAccess() {
        return "Welcome ADMIN - You have admin privileges!";
    }

    @GetMapping("/api/public")
    public String publicAccess() {
      return "This is a public endpoint!";
    }
    
}
