package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/post/{orgID}/{id}")
    public Post getPost(@PathVariable String id) {
        return postService.getPost(id);
    }

    @GetMapping("/post/{orgID}")
    public List<Post> getOrgPosts(@PathVariable String orgID) {
        return postService.getOrgPosts(orgID);
    }

    @PostMapping("/post/{orgID}")
    public void postPost(@RequestBody Post post, @PathVariable String orgID) {
        post.setOrgID(orgID);
        postService.postPost(post);
    }

    @PutMapping("/post/{orgID}")
    public void updatePost(@RequestBody Post post) {
        postService.updatePost(post);
    }

    @DeleteMapping("post/{orgID}/{id}")
    public void deletePost(@PathVariable String id) {
        postService.delete(id);
    }
}
