package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/post/{orgId}/{id}")
    public Post getPost(@PathVariable String id) {
        return postService.getPost(id);
    }

    @GetMapping("/post/{orgId}")
    public List<Post> getOrgPosts(@PathVariable String orgId) {
        return postService.getOrgPosts(orgId);
    }

    @PostMapping("/post/{orgId}")
    public void postPost(@RequestBody Post post) {
        postService.postPost(post);
    }

    @PutMapping("/post/{orgId}")
    public void updatePost(@RequestBody Post post) {
        postService.updatePost(post);
    }

    @DeleteMapping("post/{orgId}/{id}")
    public void deletePost(@RequestBody Post post) {
        postService.delete(post);
    }

}
