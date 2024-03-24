package com.codecrafters.portfolioapi.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
  private Long id;
  private String username;
  private String email;
  private String password;
  
  private String createdBy;
  private LocalDateTime dateCreated;
  private String lastModifiedBy;
  private LocalDateTime dateLastModified;
}
