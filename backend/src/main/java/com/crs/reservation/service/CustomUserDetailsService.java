package com.crs.reservation.service;

import com.crs.reservation.dao.UserRepository;
import com.crs.reservation.entity.CustomUserDetail;
import com.crs.reservation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Optional<User> optionalUser = userRepository.findByUserName(userName);

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username not found"));

        return optionalUser.map(CustomUserDetail::new).get();
    }
}
