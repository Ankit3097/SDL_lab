import java.util.Vector;

 class Demo
{
	static public void main( String... args)
	{
		Vector v = new Vector(5, 3);

		System.out.println( "Initial size = " +v.size() );
		System.out.println( "Capacity is = " +v.capacity() );

		int i = 10;
		Integer j = new Integer(i);

		v.addElement(new Double(5.45));
		v.addElement(new Float  (6.1));
		v.addElement(new Integer (7));
		System.out.println();
		System.out.println("elements added");
		System.out.println( "Size = " +v.size() );
		System.out.println( "Capacity is = " +v.capacity() );
		System.out.println();
		System.out.println( "First Element = " + v.firstElement());
		System.out.println( "Last Element = " + v.lastElement());

	}
	
}
