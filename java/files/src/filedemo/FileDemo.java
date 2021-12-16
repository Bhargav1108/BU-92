package filedemo;
import java.io.*;
public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		
		// to create the file 
		
		File file =new File("C:\\Users\\bhargav_mandadi\\Desktop\\abc.txt");
	//	System.out.println(file); // it will just print the file path name 
		//to check whether the file is present or not 
		//System.out.println(file.exists());
		//if not present then it will create the file 
	//	file.createNewFile();
	//	System.out.println(file.exists());//true
	
	    FileOutputStream fos=new FileOutputStream("C:\\Users\\bhargav_mandadi\\Desktop\\abc.txt");
		String s="This is boot camp";
		String s1="Hello Everyone!";
		String s2="Java is plantform independent";
		String s3="Python programming is used for the Data Analytics";
		
		byte[] b=s.getBytes();
		byte[] b1=s1.getBytes();
		byte[] b2=s2.getBytes();
		byte[] b3=s3.getBytes();
		fos.write(b1);
		fos.write(b);
		fos.write(b2);
		fos.write(b3);
	
		
		System.out.println("Data writed Successfully!");
		System.out.println("=========================================");
		System.out.println("Read the data form the file using FileInputReader");
		System.out.println("=========================================");
		System.out.println("To get the path of the file");
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getPath());
		
		long bytes=file.length();
		System.out.println(bytes);
		
		/* System.out.println("=========================================");
		File dir = new File("C:\\Users\\bhargav_mandadi\\Desktop\\Bhargav");
		dir.mkdirs(); 
		if (dir.isDirectory()) {
		String[] fileNames = dir.list();
		File[] files = dir.listFiles(); for (int i = 0; i < fileNames.length; i++) 
		{
		String fn = fileNames[i];
		System.out.println(fn); 
		}
		}
		
		//file.delete();
		//dir.delete(); */
		fos.close();
		
	}

}
