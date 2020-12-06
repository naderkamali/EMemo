package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
    @Id
    private String id;
    private String org_id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getId() {
        return id;
    }

    public String getOrg_id() {
        return org_id;
    }

    public String getName() {
        return name;
    }

}
