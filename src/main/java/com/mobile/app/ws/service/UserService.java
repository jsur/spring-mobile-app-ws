package com.mobile.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mobile.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto user);

}
