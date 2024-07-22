package Mavenprojecttesting.testing1;

class Byval
{
	//	int x;
	//	public void addition(int a)
	//	{
	//		x=a+5;
	//	}
	//}
	//public class CallByvalue {
	//
	//	public static void main(String[] args) {
	//		Byval b=new Byval();
	//		int x=10;
	//		b.addition(x);
	//		System.out.println(x);
	//
	//	}

public static void main(String[] args) {
	

	String s="Mahesh";
	char[] s1=s.toCharArray();
	int len=s1.length;
	for(int i=len-1;i>=0;i--) {
		System.out.println(s1[i]);	
	}
}}




