package filedemo;
import java.lang.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;

public class FileWriteAndRead {
	public static void main(String[] args) throws IOException {
	
		File f=new File("C:\\Users\\bhargav_mandadi\\Desktop\\Training\\abc.txt");
		
		FileWriter fr=new FileWriter(f);
		
		String l1="Hello this is Boot camp\n";
		String l2="we are java developers\n";
		String l3="we are under probation period\n";
		String l4="Learn properly\n";
		String l5="java prgramming is effective\n";
		String l6="IT become more popular now a days";
		
		fr.write(l1);
		fr.write(l2);
		fr.write(l3);
		fr.write(l4);
		fr.write(l5);
		fr.write(l6);
		
		long bytes=f.lastModified();
		System.out.println("Successful");
		
		System.out.println("=========================================");
		System.out.println("Last Modification time");
		System.out.println("=========================================");
		System.out.println(bytes);
		System.out.println("=========================================");
		System.out.println("Reading Data From the file");
		System.out.println("=========================================");
		
		Scanner fileReader=new Scanner(f);
		while(fileReader.hasNextLine()){
			
			String data=fileReader.nextLine();
			System.out.println(data);
			
		}
	
		
		fr.close();
		fileReader.close();
		
		
		
	}

}
