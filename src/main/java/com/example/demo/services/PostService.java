package com.example.demo.services;

import com.example.demo.models.Organization;
import com.example.demo.models.Post;
import com.example.demo.repositories.OrganizationRepository;
import com.example.demo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepo;

    public Post getPost(String id) {
        return postRepo.findById(id).get();
    }

    public List<Post> getOrgPosts(String orgId) {
        return postRepo.findAll().stream().filter(post -> post.getOrg_id().equals(orgId)).collect(
            Collectors.toList());
    }

    public void postPost(Post post) {
        postRepo.save(post);
    }

    public void updatePost(Post post) {
        postRepo.saveAndFlush(post);
    }

    public void delete(Post post) {
        postRepo.delete(post);
    }
}
