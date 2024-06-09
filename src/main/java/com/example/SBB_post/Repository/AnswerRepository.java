package com.example.SBB_post.Repository;

import com.example.SBB_post.Entity.Answer;
import com.example.SBB_post.Entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Optional<Answer> findById(Integer id);
}
