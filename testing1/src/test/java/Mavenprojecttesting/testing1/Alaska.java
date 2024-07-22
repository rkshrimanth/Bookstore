package Mavenprojecttesting.testing1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Alaska {

	public static void main(String[] args) {
//		char i;
//		for( i='A';i<='Z';i++)
//		{
//			System.out.printf("%c ",i);
//		}

	// This method takes data as input parameters. The attribute dataprovider is mapped to "getData"
//	@Test (dataProvider="getData")
    // Number of columns should match the number of input parameters
//	public void loginTest(String Uid, String Pwd){
//		System.out.println("UserName is "+ Uid);
//		System.out.println("Password is "+ Pwd);
//	}
//	
//	//If the name is not supplied, the data provider’s name automatically defaults to the method’s name. 
//	//A data provider returns an array of objects.
//	@DataProvider(name="getData")
//	public Object[][] getData(){
//		//Object [][] data = new Object [rowCount][colCount];
//		Object [][] data = new Object [2][2];
//		
//		data [0][0] = "FirstUid";
//		data [0][1] = "FirstPWD";
//		
//		data[1][0] = "SecondUid";
//		data[1][1] = "SecondPWD";
//		
//		return data;
//		
	
//	String s="a3b112d1c8";
//	String d=s.replaceAll("\\D", "");
//	System.out.println(d);
//	int v=Integer.valueOf(d);
//	
//	 int sum=0;
//	while(v!=0)
//	{
//		int rem=v%10;
//		sum=sum+rem;
//		v=v/10;
//	}
	//System.out.println(sum);
		
		
		        String input = "a12b123c13d5";
		        int sum = 0;

		        String[] numbers = input.split("\\D+");
		        
		        System.out.println(numbers);

		        for (String number : numbers) {
		            if (!number.isEmpty()) {
		                int num = Integer.parseInt(number);
		                sum += num;
		            
		        }

		        
		    }
		        System.out.println("Sum of whole numbers: " + sum);
		}

	
}
