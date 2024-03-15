package sample.Blog_spr.repo;

import org.springframework.data.repository.CrudRepository;
import sample.Blog_spr.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}

