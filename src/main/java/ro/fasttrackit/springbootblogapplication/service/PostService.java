package ro.fasttrackit.springbootblogapplication.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.springbootblogapplication.model.Post;
import ro.fasttrackit.springbootblogapplication.repository.PostRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }

    public Post save(Post post) {
        if (post.getId() == null) {
            post.setCreatedAt(LocalDateTime.now());
        }

        return postRepository.save(post);
    }

    public Optional<Post> getById(Long id) {
        return postRepository.findById(id);
    }

    public void deletePost(Post post){
        postRepository.delete(post);
    }

}
