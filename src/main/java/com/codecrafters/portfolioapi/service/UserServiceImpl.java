package com.codecrafters.portfolioapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codecrafters.portfolioapi.mapper.UserMapper;
import com.codecrafters.portfolioapi.model.dto.UserDTO;
import com.codecrafters.portfolioapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<UserDTO> getAllUsers() {
    return userRepository.findAll()
      .stream()
      .map(UserMapper::toDTO)
      .toList();
  }

  @Override
  public UserDTO getUser() {
    return null;
  }

  @Override
  public UserDTO createUser(UserDTO user) {
    return null;
  }

  @Override
  public UserDTO updateUser(UserDTO user) {
    return null;
  }

  @Override
  public void deleteUser(Long userId) {
    
  }
}
