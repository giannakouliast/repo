package com.h2.db.service;

import com.h2.db.model.repository.UserRepository;
import com.h2.db.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findBySsn(String ssn) {
        return userRepository.findBySsn(ssn);
    }
    
    public void saveUser(User user) {
        userRepository.save(user);
    }
    
    public void deleteUser(User user) {
    	
    	userRepository.delete(user);
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
    
}