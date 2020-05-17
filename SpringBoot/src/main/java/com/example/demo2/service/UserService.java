package com.example.demo2.service;

import com.example.demo2.model.User;
import com.example.demo2.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User loadUserByUsername(String s) throws UsernameNotFoundException {
        User u=userRepository.findByUsername(s);
        if(u==null){
            throw new UsernameNotFoundException("用户名或密码错误!");
        }
        return u;
    }
}
