package com.han.webApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller		//��Ʈ�ѷ� ������̼� 
public class ControllerTest {
	
	
	@RequestMapping("/formData")
	public String formData(@RequestParam("name") String name, 
							//������������ �Ѱ��� �̸�    �׸��� ������ ���� 
							@RequestParam("num") int num,
							@RequestParam("tel") String tel,   
							Model model){
											
		//@RequestParam�� �ٷ� ������������ ������Ʈ�� ���� �Ѱ��ִ� ������ �Ѵ�
		
		//String name= req.getParameter("name");
		//String num = req.getParameter("num");
		//String tel = req.getParameter("tel");
		
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("tel", tel);
		return "formView";
	}
	
	
	/*
	//������ ���� ,post�� ����
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
	
	//a�±׷� ����
	//������Ʈ���� ���� �߿� , �޼ҵ�� �������
	// /aLink�� ������ �޼ҵ� ������θ� �ްڴ� 
	// aLink�̸������� �����Ҷ� req�� Ŭ���̾�Ʈ�� ���� ������ �������//�޼ҵ� ȣ��Ǵ� ����
	@RequestMapping(value="/aLink", method=RequestMethod.GET)
	public String aLinkTest(HttpServletRequest req, Model model){	//Ŭ���̾�Ʈ�� ���������ʹ� �𵨿� ������� 
		
		//Ŭ���̾�Ʈ ������ ���� ������ 
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		
		//��� ������ ������ 
		model.addAttribute("num", num);
		model.addAttribute("name", name);
		return "aLink";		//������ �� �ҷ��� jsp������ ���� 
	}
	
	@RequestMapping("/view1")		//view1���� ������ �ϸ� �Ʒ� �޼ҵ尡 ����� 
	public String viewTest(Model model){
		
		//�̸� , ����ó , 
		model.addAttribute("name", "ȫ�浿");
		model.addAttribute("tel", "010-1234-4567");
		return "view1";
	}
}
