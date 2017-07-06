import java.util.Scanner;
class Op
{
	protected int num1, num2;
	
	public Op( )
	{
		System.out.println(" Default constucter is called");
		num1 = 0;
		num2 = 0;
	}

	public Op(int n1, int n2 )
	{
		System.out.println(" parameterize constucter is called");
		num1 = n1;
		num2 = n2;
	}
}

class Addition extends Op
{
	public  Addition()
	{
		System.out.println("In add child : default constructer is called");
	}
	public void operation()
	{
		int sum = num1 + num2;
		System.out.println("Addition " + sum);
	}
}

class DemoOp
{
	public static void main( String[] args )
	{
		Op obj = new Op();
		Addition cObj = new Addition();
		cObj.operation();
	}
}
