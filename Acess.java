class DemoAccess
{
	private String s;

	public String getS()
	{
		return s;
	}

	public void setS (String str )
	{
		s = str;
	}
}

 class Access
{
	public static void main( String[] args )
	{
		DemoAccess obj = new DemoAccess();
		obj.s1= "java";
		String s1= obj.getS();
		System.out.println("String is " + s1);
		obj.getS();
		obj.setS("Ankit");	
	}
}

