package Selenium;

public class Testing1 {

	public static void main(String[] args) {
		String a="abcd";
		int i=2;
		int size=a.length()/i;
		String[] p= {a.substring(0,size),a.substring(size)};
		
		//String a1[]=a.split("",2);
		for(String a2:p)
		{
		System.out.println(a2);
	}
}}
