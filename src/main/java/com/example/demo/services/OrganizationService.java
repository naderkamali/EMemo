package com.example.demo.services;

import com.example.demo.models.Organization;
import com.example.demo.repositories.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository orgRepo;

    public Organization getOrganization(String id) {
        return orgRepo.findById(id).get();
    }


    public void postOrganization(Organization org) {
        orgRepo.save(org);
    }
}
