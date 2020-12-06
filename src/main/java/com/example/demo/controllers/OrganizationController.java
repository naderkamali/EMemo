package com.example.demo.controllers;

import com.example.demo.models.Organization;
import com.example.demo.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;

    @GetMapping("/organization/{id}")
    public Organization getOrganization(@PathVariable String id) {
        return organizationService.getOrganization(id);
    }

    @PostMapping("/organization")
    public void postOrganization(@RequestBody Organization org) {
        organizationService.postOrganization(org);
    }
}
