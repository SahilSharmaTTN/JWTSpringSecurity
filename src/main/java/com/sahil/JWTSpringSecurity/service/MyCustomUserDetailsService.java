package com.sahil.JWTSpringSecurity.service;

import com.sahil.JWTSpringSecurity.model.AppUser;
import com.sahil.JWTSpringSecurity.repos.AppUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyCustomUserDetailsService implements UserDetailsService {

    @Autowired
    AppUsersRepository appUsersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(username.equals("Sahil")){
            return new User("Sahil","test", Arrays.asList());
        }
        else{
            throw new UsernameNotFoundException("User not found");
        }

//        AppUser appUser = appUsersRepository.findByUsername(username);
//
//        if(appUser.getUsername().equals(username)){
//            return new User(appUser);
//        }
//        else{
//            throw new UsernameNotFoundException("user not found");
//        }
    }
}
