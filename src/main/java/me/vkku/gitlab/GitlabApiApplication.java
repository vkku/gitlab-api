package me.vkku.gitlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GitlabApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitlabApiApplication.class, args);
	}

}
