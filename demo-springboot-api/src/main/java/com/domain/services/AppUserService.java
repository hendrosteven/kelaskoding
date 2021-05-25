package com.domain.services;

import javax.transaction.Transactional;

import com.domain.models.entities.AppUser;
import com.domain.models.repos.AppUserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AppUserService implements UserDetailsService{

    @Autowired
    private AppUserRepo appUserRepo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {        
        return appUserRepo.findByEmail(email)
        .orElseThrow(() -> 
            new UsernameNotFoundException(String.format(
                "user with email '%s' not found", email
            )));
    }

    public AppUser signUpAppUser(AppUser appUser){
        boolean userExists = appUserRepo.findByEmail(appUser.getEmail()).isPresent();
        if(userExists){
            throw new RuntimeException(String.format("email '%s' already exists",appUser.getEmail()));
        }

        String encodedPassword = bCryptPasswordEncoder.encode(appUser.getPassword());
        appUser.setPassword(encodedPassword);
        return appUserRepo.save(appUser);        
    }
    
}
