package com.mohsabbah.todo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TodoUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("user") || username.equals("admin")) {
            return User.withUsername(username)
                    .password("{noop}password")
                    .roles("USER")
                    .build();
        }
        throw new UsernameNotFoundException("user not found");
    }
}
