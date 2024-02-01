package com.myblog20.myblog20.Repository;

import com.myblog20.myblog20.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
