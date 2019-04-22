package com.questionairv1;

import com.questionairv1.dao.ConnectionFactory;
import com.questionairv1.dao.QuestionDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class Questionairv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Questionairv1Application.class, args);
                
                QuestionDAOImpl dao = new QuestionDAOImpl();
                System.out.print(dao.getAllTheQuestions().get(0).getIdCat());
	}

}
