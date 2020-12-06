package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Post {
    @Id
    private String id;
    private String org_id;
    private String title;
    private String content;

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}
