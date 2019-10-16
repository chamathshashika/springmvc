package com.chamath;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.codegen.IntegerCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chamath.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		
//		int i = Integer.parseInt(request.getParameter("t1"));
//		
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		
		AddService ad = new AddService();
		
		int k = ad.add(i, j);
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		
		return mv;
		
		
	}
	
}
