package serialization;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

	
	public static void main(String[] args) throws Exception {

	Employee emp = new Employee();
	emp.setAge(42);
	emp.setName("Bhargav");
	emp.setSalary(25000);

	File file = new File("C:\\Users\\bhargav_mandadi\\Desktop\\data.odt");
	FileOutputStream fos = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(fos);

	//First Read all objects from the file..
	//The save again along with new objects.

	oos.writeObject(emp);

	oos.close();

	System.out.println("Object saved Successfully");
	}


	}

