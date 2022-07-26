package com.learnspring.learningspring;

import com.learnspring.learningspring.model.Pojo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LearningSpringApplication.class)
class LearningSpringApplicationTests {

	@Test
	void contextLoads() {
	}

}
