package com.niit;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.sonebackend.dao.AdminDAO;
import com.niit.sonebackend.dao.UserDAO;
import com.niit.sonebackend.model.Admin;
import com.niit.sonebackend.model.User;

@Controller
public class AdminController {
	
	@Autowired
	User user;
	@Autowired
	private AdminDAO adminDAO;
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private  Admin admin;
	/*@RequestMapping("/")
	@Autowired
	public ModelAndView onLoad(HttpSession session)
	{
		ModelAndView mv=new ModelAndView("/home");
		session.setAttribute("admin",admin);
			session.setAttribute("adminList", adminDAO.list());
			System.out.println("size:"+adminDAO.list());
			return mv;
	}
	@RequestMapping(value="user/register",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute User user)
	{

		ModelAndView mv=new ModelAndView("/home");
		if (userDAO.get(user.getId())==null) {
			userDAO.save(user);
			mv.addObject("msg","you are successfully registered");
		} else {
			mv.addObject("msg","no user exist with this id");
		}
	
		return mv;
	}
*/	
	
	
	@RequestMapping("/")
	public ModelAndView home()
	{

		ModelAndView mv=new ModelAndView("home");
		mv.addObject("user",user);
		mv.addObject("user clicked signup here","true");
		return mv;
	}
 
	
	
	@RequestMapping("/signup")
	public ModelAndView signup()
	{

		ModelAndView mv=new ModelAndView("/home");
		mv.addObject("user",user);
		mv.addObject("user clicked signup here","true");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{

		ModelAndView mv=new ModelAndView("/home");
		mv.addObject("user",user);
		mv.addObject("user clicked login here","true");
		return mv;
}
}
