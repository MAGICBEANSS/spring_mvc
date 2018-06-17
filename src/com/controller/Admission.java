package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admission")
public class Admission {


	@RequestMapping(value="/admitpage" ,method = RequestMethod.GET)
	 ModelAndView getmyPage(@ModelAttribute ("a1") Student s1) {
		System.out.println(s1.toString());	
		 ModelAndView mv = new ModelAndView("admissionform");
		 return mv;		 
	 }
	@RequestMapping(value="/submiss" , method=RequestMethod.GET)
	ModelAndView submit(@ModelAttribute ("s1s") Student s1)
	{
		System.out.println("s1 hsa ");
		ModelAndView mv = new ModelAndView("successfull");
		// mv.addObject("welcomepage","successfull");
		return mv;
		
	}
	
	@RequestMapping(value="/submission" ,method = RequestMethod.POST)
 ModelAndView getAdmission(@RequestParam(value="fname" , defaultValue="Mr XYZ") String fname,@RequestParam("lname") String lname) {
	 ModelAndView mv = new ModelAndView("successfull");
	 mv.addObject("name", fname+" "+lname);
	 
	 
	 return mv;
			 
 }
	
	
	@RequestMapping(value="/submit" )
 ModelAndView doAdmission(@ModelAttribute("s1si") Student s1) {
	 ModelAndView mv = new ModelAndView("successfull");
	 System.out.println(mv.toString());
	 if(mv.getModelMap()!=null)
	 {
		 System.out.println("!null "+mv.getModelMap());
	 }
	 if(mv.getModel()!=null)
	 {
		 System.out.println("!2null "+mv.getModel());
	 }
	 return mv;
			 
 }
	
	/*@ModelAttribute
	public void addattribute(Model model)
	{
		model.addAttribute("welcomemessage","Welcome from ABC College of engineering");
	}*/
	
	
	
	
}
