package com.example.SBB_post;

import com.example.SBB_post.Entity.Answer;
import com.example.SBB_post.Entity.Question;
import com.example.SBB_post.Repository.AnswerRepository;
import com.example.SBB_post.Repository.QuestionRepository;

import com.example.SBB_post.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbPostApplicationTests {
	@Autowired
	QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]" , i);
			String content = "내용 없음";
			this.questionService.create(subject, content, null);
		}
	}

}
