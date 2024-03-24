package com.codecrafters.portfolioapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.codecrafters.portfolioapi.model.dto.UserDTO;
import com.codecrafters.portfolioapi.service.UserService;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<UserDTO> users() {
    return this.userService.getAllUsers();
  }
}
