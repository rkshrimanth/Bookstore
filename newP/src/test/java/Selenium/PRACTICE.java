package Selenium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PRACTICE {

	public static void main(String[] args) {

        
		String s="welcome home";
		
		String ss[]=s.split(" ");
		
		String sen="";
		for( String d:ss)
		{
			String rev="";
			for(int i=d.length()-1;i>=0;i--)
			{
				rev=rev+d.charAt(i);
			}
			sen=sen+rev+" ";
		}
		System.out.println(sen);
    }
}