package com.whatsupBlog.application.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.whatsupBlog.application.dto.MemberDto;

@RestController
public class MainController {
	@GetMapping("/helloWorld")
	public List<String> helloWorld(@RequestParam String id){
		return Arrays.asList("안녕하세요", id);
	}
	
	@RequestMapping("/api/users")
	public MemberDto users() {
		System.out.println("users 진입!");
		
		MemberDto mdto = new MemberDto();
		mdto.setEmail("asdf@naver.com");
		mdto.setId("asdf");
		mdto.setPassword("a123123");
		mdto.setUserName("AAA");

		return mdto;
	}
}
