import java.util.Scanner;
import java.lang.*;

class Area
{
	private int sides;
	private int length;
	
	public int getS()
	{
		return sides;
	}
	
	public void setS( int a )
	{
		 sides = a ;
	}
	
	public void setSl( int a )
	{
		 length = a ;
	}
	
	public int calculateArea()
	{
		return (length * length ); 	
	}		
}

class Area1
{
	public static void main( String[] args )
	{	
		Area a1 = new Area();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of sides in poygon?");
		int i = in.nextInt();
		a1.setS(i);
		System.out.println("Number of sides entered by the user " + i );
		System.out.println("Enter the length of side" );
		int j = in.nextInt();
		a1.setSl(j);
		System.out.println("Area of poygon " + a1.calculateArea() );	
	}
}

 
