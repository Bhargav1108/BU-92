package employee;
import java.util.*;
public class Sorting {



public static void main(String[] args) {



Employee e1 = new Employee(10,25,"Bhargav",25000.5);
Employee e2 = new Employee(11,23, "Pritam", 12349.0);
Employee e3 = new Employee(12, 26, "Madhu", 1200);
Employee e4 = new Employee(13, 22, "Neha", 1500);



Employee[] empArr = { e1, e2, e3, e4 };



System.out.println(Arrays.toString(empArr));



Arrays.sort(empArr); // e1.compareTo(e2), e2.compareTo(e3),.......



System.out.println(Arrays.toString(empArr));



}



}
