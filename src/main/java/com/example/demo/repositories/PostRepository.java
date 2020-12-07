package com.example.demo.repositories;

import com.example.demo.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, String> {
    public List<Post> findAllByOrgID(String orgID);
}
