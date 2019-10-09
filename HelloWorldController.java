package com.javatpoint;
import javax.servlet.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class HelloWorldController 
{  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res)
    {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
       if(password.equals("admin"))
        {  
        String message = "HELLO "+name;  
        return new ModelAndView("hellopage", "message", message);  
        }  
        else{  
 return new ModelAndView("errorpage", "message","Sorry, username or password error");  
        }      }     }  


