package com.codecrafters.portfolioapi.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
  @NotBlank(message = "Username is required")
  private String username;

  @NotBlank(message = "Email is required")
  @Size(max = 255, message = "Email must be at most 255 characters")
  private String email;

  @NotBlank(message = "Password is required")
  private String password;
  
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
