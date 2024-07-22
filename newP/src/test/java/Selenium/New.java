package Selenium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		String ss="wlcome to testing";
		String ss1[]=ss.split(" ");
		String sen="";
		  for(String ee:ss1)
		  {
			  String word="";
			  for(int i=ee.length()-1;i>=0;i--)
			  {
				  word=word+ee.charAt(i);
			  }
			  sen=sen+word+" ";
		  }
		  System.out.println(sen);
	}
}

