package com.example.demo.services;

import com.example.demo.models.Organization;
import com.example.demo.models.User;
import com.example.demo.repositories.OrganizationRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public User getUser(String id) {
        return userRepo.findById(id).get();
    }

    public void postUser(User user) {
        userRepo.save(user);
    }

    public List<User> getUsers(String org_id) {
        return userRepo.findAllByOrgID(org_id);
    }
}
