package com.example.boot12.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		//공지사항 
		List<String> list=new ArrayList<String>();
		list.add("추운 겨울입니다");
		list.add("감기 조심 하세요");
		list.add("어쩌구...");
		list.add("저쩌구...");
		//Model 객체에 담으면 자동으로 request 영역에 담긴다 
		model.addAttribute("notice", list);
		/*
		 *  thymeleaf 를 뷰 엔진으로 사용할때  "home" 이라는 문자열을 리턴하면 
		 *  templates/home.html  thymeleaf 에서 응답이 된다.
		 *  
		 *  이 예제에서는 main/webapp/WEB-INF/views/home.jsp 페이지가 응답하도록 한다 
		 *  - spring boot 는 default 로 jsp 페이지를 사용할수가 없다 
		 *  - webapp 폴더도 존재하지 않는다 (직접 수동으로 만들어야 한다)
		 *  - 필요한 의존 dependency 도 추가해 주어야 한다.
		 *  - application.properties 파일에 view 페이지 prefix, suffix 설정을 해야한다  
		 */
		return "home";
	}
}










