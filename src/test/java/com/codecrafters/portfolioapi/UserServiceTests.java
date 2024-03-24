package com.codecrafters.portfolioapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codecrafters.portfolioapi.service.UserServiceImpl;

import lombok.val;

@SpringBootTest
class UserServiceTests {
	@Autowired
	private UserServiceImpl userService;

	@Test
	void findAllUsers() {
		val users = this.userService.getAllUsers();
		assertEquals(1, users.size());
	}
}
