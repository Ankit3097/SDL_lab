/* Assignment : properties */
/*. create properties file containing key-value pair information as 
		-> protocol
		-> IP
		-> Port
		-> File-name (Specify your data )
		
	2. Load property file 
	
	3. Display all value
	
	4. Display via Enumeration
	
	5.create property file programmatically
*/
import java.util.Enumeration;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

class PropertyStream
{
	public static void main ( String... args )
	{
		String str;
		Properties  prop = new Properties();
		InputStream input = null;
		
		Enumeration E = prop.propertyNames();
			
				 
		try
		{
			input = new FileInputStream( "data.properties");
			prop.load ( input );
			
			System.out.println( prop.getProperty("Ip") );
			System.out.println( prop.getProperty("Port") );
			System.out.println( prop.getProperty("Protocol") );
			
			while ( E.hasMoreElements() )
			{
					str = ( String )E.nextElement();
							
					System.out.println(prop.getProperty(str));
			}
		}
		
		
			
		catch(IOException e )
		{
			e.printStackTrace();
		}
		
		finally
		{
			if (input != null )
			{
				try
				{
					input.close();
				}
				
				catch( IOException e1 )
				{
					e1.printStackTrace();
				}
			}
		}
	}
}
								
				
			
		
	
