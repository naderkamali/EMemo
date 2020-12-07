package com.example.demo.controllers;

import com.example.demo.models.Organization;
import com.example.demo.models.User;
import com.example.demo.services.OrganizationService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/organization/{org_id}/users")
    public List<User> getUser(@PathVariable String org_id) {
        return userService.getUsers(org_id);
    }

    @GetMapping("/organization/{org_id}/{id}")
    public User getUser(@PathVariable String org_id, @PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping("/organization/{org_id}/newuser")
    public void postUser(@PathVariable String org_id, @RequestBody User user) {
        user.setOrgID(org_id);
        userService.postUser(user);
    }
}
