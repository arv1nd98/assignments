package com.mydxcusers.SBA2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mydxcusers.SBA2.dao.DxcUsersDao;
import com.mydxcusers.SBA2.model.DxcUsers;

@Controller
public class HomeController {
	
	@Autowired
	DxcUsersDao dao;
	
	//Returns home
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		return "home";
	}
	@RequestMapping(value = "/home")
	public String homee(Model model) {
		return "home";
	}

	@RequestMapping(value="/New User")
	public String newUser(Model model)
	{
	return "Signup";
	}
	
	@RequestMapping(value="/display")
	public String display(Model model,@ModelAttribute DxcUsers dxcusers)
	{
	String status=dao.saveUser(dxcusers);
	model.addAttribute("status",status);
	System.out.println(status);
	return "display";
	}
	  
int userId=0;
@RequestMapping(value="/validateUser")
public String validateUser(Model model,@RequestParam("userId") String userId,@RequestParam("password") String password )
{
	int dxcuserId=Integer.parseInt(userId);
	this.userId=dxcuserId;
	DxcUsers dxcUsers=dao.getUserById(dxcuserId);
	String dxcPassword=dxcUsers.getPassword();
	System.out.println(dxcPassword);
	System.out.println(password);
	System.out.println(dxcUsers);
		
		 if((dxcUsers != null)&&(dxcPassword.equals(password)))
		 {
			 System.out.println("login successful"); 
			 return "LoginSuccess";
		 }
		 else 
	     {
			 System.out.println("failed");
			 return "LoginFailed";
	     }
		}
	
	
	  @RequestMapping(value="/ForgotPassword") 
	  public String forgotPassword(Model model) { 
		  return "ChangePassword"; 
		  }
	  
	  @RequestMapping(value="/ChangePassword") 
	  public String passwordModification(Model model,@RequestParam("userId") String userId,@RequestParam("security_question") String security_question,@RequestParam("security_answer") String security_answer)
	  {
	  int dxcuserId=Integer.parseInt(userId); this.userId=dxcuserId; DxcUsers
	  dxcUsers=dao.getUserById(dxcuserId); String
	  dxcSecurity_question=dxcUsers.getSecurity_question(); String
	  dxcSecurity_answer=dxcUsers.getSecurity_answer();
	  
	  System.out.println(dxcSecurity_question);
	  System.out.println(dxcSecurity_answer); System.out.println(dxcUsers);
	  
	  if((dxcUsers !=null)&&(dxcSecurity_answer.equalsIgnoreCase(security_answer))&&(dxcSecurity_question.equalsIgnoreCase(security_question))) {
	  System.out.println("login successful"); 
	  return "ForgotPassword";
	  }
	  else 
	  {
	  System.out.println("failed"); 
	  return "SecurityInvalid"; 
	  } 
	  }
	  
	  DxcUsers dxcusers;
	  
	
	 
	  @RequestMapping(value = "/changePassword")
		public String changePassword(Model model, 
				@RequestParam("password") String password)
	  {
				String s=dao.updatePassword(userId, password);
				System.out.println(s);
				return "changePasswordSuccess";
		}
	
	 
	 
	 
}
