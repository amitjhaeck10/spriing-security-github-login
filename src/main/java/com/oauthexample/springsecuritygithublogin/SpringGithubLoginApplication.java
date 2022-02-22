package com.oauthexample.springsecuritygithublogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringGithubLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGithubLoginApplication.class, args);
	}

	@GetMapping("/user")
	public String user(@AuthenticationPrincipal OAuth2User principal){
		System.out.println("UserName: "+principal.getName());
       return "Amit Jha";
	}

}
