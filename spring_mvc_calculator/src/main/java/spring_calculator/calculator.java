package spring_calculator;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class calculator {
	
@RequestMapping("add")
public void addition(HttpServletRequest req,HttpServletResponse  res) throws IOException
{
	int num1=Integer.parseInt(req.getParameter("num1"));
	int num2=Integer.parseInt(req.getParameter("num2"));
	res.getWriter().print("<h1> the sum of "+num1+" and "+ num2+" is "+(num1+num2)+ "</h1>");
	System.out.println("hey iam Addition");
}
 @RequestMapping("sub")
 public void subtraction(@RequestParam int num1, @RequestParam int num2, HttpServletResponse res) throws IOException
 {
	 res.getWriter().print("<h1> the subtraction of "+num1+" and "+num2+" is "+(num1-num2)+"</h1>");
 }
 @RequestMapping("mul")
 @ResponseBody
 public String multipliction(@RequestParam int num1, @RequestParam int num2, HttpServletResponse res) throws IOException
 {
	 return("<h1> the subtraction of "+num1+" and "+num2+" is "+(num1*num2)+"</h1>");
 }
}
