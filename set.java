import java.util.HashSet;
import java.util.Vector;
import java.util.Set;

class DemoSet
{
	public static void main( String... args )
	{
	
		HashSet s = new HashSet(5);
		
		s.add("test1");
		s.add(10);
		
		Vector v = new Vector(3);
		
		v.add ("MIT");
		v.add (10);
		v.add (new Double(2.456));
		
		s.addAll(v);
		
		System.out.println ( s );
		
		Set sObj = new HashSet(5);
		Object obj = sObj.clone();
		 
	}	
}				
