package p1;
public class NormalException  {
	
	public static void cal() throws Throwable {
		
		System.out.println("Before Exception");
		
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("After Exception");
	}
	
	
	public static void main(String[] args) throws Throwable {
		
		System.out.println("Before Calling Method");
		
		cal();
		
		System.out.println("Done");
	}

	
}
