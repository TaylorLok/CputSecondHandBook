package com.cput.ac.org.repository;

import com.cput.ac.org.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,String>
{
}
