package Selenium;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class first {
	 
	public static void main(String[] args) {
		int sum=0;
		String s="abcd123e";
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				sum+=Character.getNumericValue(ch);
			}
		}
	
		System.out.println(sum);
		
	}
	}

