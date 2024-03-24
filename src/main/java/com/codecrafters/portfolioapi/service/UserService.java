package com.codecrafters.portfolioapi.service;

import java.util.List;

import com.codecrafters.portfolioapi.model.dto.UserDTO;

public interface UserService {
  List<UserDTO> getAllUsers();
  UserDTO getUser();
  UserDTO createUser(UserDTO user);
  UserDTO updateUser(UserDTO user);
  void deleteUser(Long userId);
}