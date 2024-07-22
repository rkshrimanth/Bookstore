package Mavenprojecttesting.testing1;
 abstract class Animal
{
	
	abstract void eat();
	
	abstract void sub();
	
	
	 
}
 class B extends Animal
 {
	void eat() 
	{
		System.out.println("this is eat");
	}
	void sub() 
	{
		System.out.println("this is sub");
	}
 }
public class Testsuper2 {
	public static void main(String[] bgs) {
		B bb=new B();
		bb.eat();
		bb.sub();
	}
}
