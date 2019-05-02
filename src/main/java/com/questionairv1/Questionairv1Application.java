package com.questionairv1;

import com.questionairv1.dao.ConnectionFactory;
import com.questionairv1.dao.QuestionDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class Questionairv1Application {

	public static void main(String[] args) {
		SpringApplication.run(Questionairv1Application.class, args);
                
                QuestionDAOImpl dao = new QuestionDAOImpl();
                System.out.print(dao.getAllTheQuestions().get(0).getIdCat());
	}
        @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurerAdapter() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**").allowedOrigins("*");
                }
            };
        }
}
