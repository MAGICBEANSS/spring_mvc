package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
@Controller
@RequestMapping(value = "/aa" )
public class HelloWorld  {

	@RequestMapping(value = "/tportal/{a}/{b}")
	protected ModelAndView hello(@PathVariable("a") String a,@PathVariable("b") String b  ) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("HelloPage");
	//	mv.setViewName("Welcome");
		//String send = map.get("a") + " from dept "+ map.get("b") ;
		String send = b+ " from dept "+a;
		mv.addObject("username", send);
		return mv;
	}
	
	
	@RequestMapping("/portal/{dept}/{dept}")
	protected ModelAndView hello(@PathVariable Map<String,String> map) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("HelloPage");
	//	mv.setViewName("Welcome");
		if(map.get("name")==null)
		{
			map.put("name", "sdfjk");
		}
		String send = map.get("name") + " from dept "+ map.get("dept") ;
		mv.addObject("username", send);
		return mv;
	}
	
	
	@RequestMapping("/webportal/{dept}/{name}")
	protected ModelAndView hiall(@PathVariable Map<String,String> amap) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("HelloPage");
	//	mv.setViewName("Welcome");
		String send = amap.get("name") + " from dept "+amap.get("dept");
		mv.addObject("username", send);
		return mv;
	}
	
	
	
	
	
	
	
	
	
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("HelloPage");
	//	mv.setViewName("Welcome");
		mv.addObject("username", "mb");
		return mv;
	}

	
	protected ModelAndView handleRequestInternalj(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("HelloPage");
	//	mv.setViewName("Welcome");
		mv.addObject("username", "magicbens");
		return mv;
	}

}
