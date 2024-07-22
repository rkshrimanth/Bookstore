package Mavenprojecttesting.testing1;


interface A
{
	void eatt();
}

class B1 implements A
{
	public void eatt()
	{
		int s=12;
		System.out.println(s);
		String g="ddd";
		System.out.println("this is interface");
	}
}
public class Inter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b=new B1();
		b.eatt();
	}

}
