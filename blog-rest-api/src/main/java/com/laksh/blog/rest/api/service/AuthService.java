package com.laksh.blog.rest.api.service;


import com.laksh.blog.rest.api.payload.LoginDto;
import com.laksh.blog.rest.api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);

}
