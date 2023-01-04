package com.project.questapp.controllers;

import com.project.questapp.entities.Post;
import com.project.questapp.repository.PostRepository;
import com.project.questapp.requests.PostCreateRequest;
import com.project.questapp.requests.PostUpdateRequest;
import com.project.questapp.services.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    private PostService postService;
    private final PostRepository postRepository;

    public PostController(PostService postService,
                          PostRepository postRepository){
        this.postService=postService;
        this.postRepository = postRepository;
    }
    @GetMapping
    public List<Post> getAllPosts(@RequestParam Optional<Long> userId){
        return postService.getAllPosts(userId);
    }
    @GetMapping("/{postId}")
    public  Post getOnePost(@PathVariable Long postId){
        return postService.getOnePostId(postId);
    }
    @PostMapping
    public Post createOnePost(@RequestBody PostCreateRequest newPostRequest){
        return postService.createOnePost(newPostRequest);
    }

    @PutMapping("/(postId)")
    public  Post updateOnePost(@PathVariable Long postId,@PathVariable PostUpdateRequest updatePost){

        return postService.updateOnePostById(postId,updatePost);
    }

    @DeleteMapping("/(postId)")
    public void deleteOnePost(@PathVariable Long postId){
        postService.deleteOnePostById(postId);
    }



}
