package com.nissan.firstque;

//import com.sun.xml.internal.ws.util.StringUtils;

public class firstque {

	public String function_name(String a, String b)
	{
		
		System.out.println(a);
		System.out.println(b);
		double num1=0,num2=0;
		try{
			 num1=Double.parseDouble(a);
		}
		catch (Exception e){
			System.out.println(e);
			return "Invalid First number";
		}
		
		try{
			 num2=Double.parseDouble(b);
		}
		catch (Exception e){
			System.out.println(e);
			return "Invalid Second number";
		}
		
		System.out.println("Num1 is " +num1);
		System.out.println("Num2 is " +num2);
		System.out.println("Result is " +(num1+num2));
		Double ans =0.0;
		ans = num1 + num2;
		
		return String.valueOf(ans);
	}

}
