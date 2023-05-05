package com.dailycodebuffer.jwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //Logic to get the user form the Database
        String user=null;
        String password=null;
        if(userName.equals("admin"))
        {
            user="admin";
            password="admin";
        }
        else if(userName.equals("souvik"))
        {
            user="souvik";
            password="souvik2000";
        }


        return new User(user,password,new ArrayList<>());
    }
}
