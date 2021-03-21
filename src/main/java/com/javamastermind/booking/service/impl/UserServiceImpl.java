/**
 * 
 */
package com.javamastermind.booking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamastermind.booking.model.User;
import com.javamastermind.booking.repository.UserRepository;
import com.javamastermind.booking.service.UserService;

/**
 * @author lahiru_w
 */
@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserByEmail(String email)
    {
        return userRepository.findById(email).orElse(null);
    }

}
