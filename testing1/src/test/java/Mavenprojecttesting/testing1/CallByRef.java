package Mavenprojecttesting.testing1;
class ByRef
{
	int x;
	public void addition(ByRef a)
	{
		x=a.x+5;
	}
}
public class CallByRef {

	public static void main(String[] args) {
		ByRef b=new ByRef();
		b.x=10;
		b.addition(b);
		System.out.println(b.x);

	}

}
