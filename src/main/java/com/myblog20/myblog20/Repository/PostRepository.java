package com.myblog20.myblog20.Repository;

import com.myblog20.myblog20.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
