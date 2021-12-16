package filedemo;
import java.lang.*;
import java.util.*;
public class markspercentage {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int sum_of_marks=0;
			System.out.println("Enter Number of Subjects:");
			int n=sc.nextInt();
			int[] marks=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter Marks For "+(i+1)+" Subject:");
				marks[i]=sc.nextInt();
			}
			for(int i=0;i<marks.length;i++) {
				sum_of_marks+=marks[i];
			}
			float percentage=(sum_of_marks/n);
			System.out.println("Total Marks = "+sum_of_marks);
			System.out.println("Percentage = "+percentage+" %");
			if(percentage>=60) {
				System.out.println("Division: First !");
			}
			else if(percentage>=40 && percentage<60) {
				System.out.println("Division: Second !!");
			}
			else if(percentage>=33 && percentage<40) {
				System.out.println("Division: Third");
			}
			else if(percentage<33) {
				System.out.println("Division: Failed You have to imporve your studies ");
			}
			else {
				 System.out.println("");
			}
		}
	}
}
