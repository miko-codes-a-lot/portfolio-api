package com.codecrafters.portfolioapi.mapper;

import com.codecrafters.portfolioapi.model.dto.UserDTO;
import com.codecrafters.portfolioapi.model.entity.User;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {
  public UserDTO toDTO(User user) {
    return UserDTO.builder()
      .id(user.getId())
      .username(user.getUsername())
      .email(user.getEmail())
      .password(user.getPassword())
      .createdBy(user.getCreatedBy())
      .dateCreated(user.getDateCreated())
      .lastModifiedBy(user.getLastModifiedBy())
      .dateLastModified(user.getDateLastModified())
      .build();
  }

  public User fromDTO(UserDTO userDTO) {
    final User user = new User();
    user.setId(userDTO.getId());
    user.setUsername(userDTO.getUsername());
    user.setEmail(userDTO.getEmail());
    user.setPassword(userDTO.getPassword());
    user.setCreatedBy(userDTO.getCreatedBy());
    user.setDateCreated(userDTO.getDateCreated());
    user.setLastModifiedBy(userDTO.getLastModifiedBy());
    user.setDateLastModified(userDTO.getDateLastModified());
    return user;
  }
}
