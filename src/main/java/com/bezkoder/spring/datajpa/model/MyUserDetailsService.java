package com.bezkoder.spring.datajpa.model;

import com.bezkoder.spring.datajpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       Optional<Customer> customer = customerRepository.findByName(userName);

       customer.orElseThrow(()-> new UsernameNotFoundException("Not Found: "+ userName));

       return customer.map(MyUserDetails::new).get();
    }
}
