import java.util.Scanner;
abstract class Employee
{
	protected int type, wages;
	abstract public void calculateSalary();	
}

class Manager extends Employee
{
	public Manager(int t, int w )
	{
	
		type = t;
		wages = w;
	}
	
	public void calculateSalary()
	{
		int salary = 30 * wages;
	}
	
	public void getSalary()
	{
		System.out.println( "Salary is " );
	}
	
}

class DemoAbstract
	{
		public static void main ( String[] args )
		{
			//Employee eObj = new Employee(1, 2000);
			Manager mObj = new Manager(1, 2000);
			mObj.calculateSalary();
			mObj.getSalary();			
		}
	}

