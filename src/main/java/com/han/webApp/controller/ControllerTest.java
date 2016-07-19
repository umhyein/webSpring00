package com.han.webApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller		//컨트롤러 어노테이션 
public class ControllerTest {
	
	
	@RequestMapping("/formData")
	public String formData(@RequestParam("name") String name, 
							//앞페이지에서 넘겨준 이름    그리고 저장할 변수 
							@RequestParam("num") int num,
							@RequestParam("tel") String tel,   
							Model model){
											
		//@RequestParam는 바로 전페이지에서 리퀘스트한 값을 넘겨주는 역할을 한다
		
		//String name= req.getParameter("name");
		//String num = req.getParameter("num");
		//String tel = req.getParameter("tel");
		
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("tel", tel);
		return "formView";
	}
	
	
	/*
	//폼으로 접속 ,post로 접속
	@RequestMapping("/formData")
	public String formData(HttpServletRequest req, Model model){
		
		String name= req.getParameter("name");
		String num = req.getParameter("num");
		String tel = req.getParameter("tel");
		
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("tel", tel);
		return "formView";
	}
	*/
	
	//a태그로 접속
	//리퀘스트메핑 값이 중요 , 메소드는 상관음슴
	// /aLink의 접속을 메소드 방식으로만 받겠다 
	// aLink이매핑으로 접속할때 req에 클라이언트가 보낸 정보가 담겨있음//메소드 호출되는 순간
	@RequestMapping(value="/aLink", method=RequestMethod.GET)
	public String aLinkTest(HttpServletRequest req, Model model){	//클라이언트에 보낼데이터는 모델에 담으면됨 
		
		//클라이언트 측에서 보낸 데이터 
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		
		//뷰로 데이터 보내기 
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		return "aLink";		//뷰파일 즉 불러올 jsp파일을 리턴 
	}
	
	@RequestMapping("/view1")		//view1으로 접속을 하면 아래 메소드가 실행됨 
	public String viewTest(Model model){
		
		//이름 , 연락처 , 
		model.addAttribute("name", "홍길동");
		model.addAttribute("tel", "010-1234-4567");
		return "view1";
	}
}
