package p1;
import java.io.*;
public class throwsException  {
	
	public static void main(String[] args) throws Throwable {
		
		p2();
	}
	public static void p2() throws Throwable {
		p1();
	}
	public static void p1() throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   String a= br.readLine();
	   
	   System.out.println(br);
	   
	   System.out.println(a);
	}
	
	
}
