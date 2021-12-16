package serialization;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	


	public static void main(String[] args) throws Exception {



	File file = new File("C:\\Users\\bhargav_mandadi\\Desktop\\data.odt");
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);



	Employee obj1 =(Employee) ois.readObject();
	//Employee obj2 = (Employee) ois.readObject(); 
	//it will raise an error whenever we try to get the updated object and existing object
	// the existing data is overwritten when ever we save or write the object into a hard disk 

	System.out.println(obj1.toString());
	//System.out.println(obj2);


	ois.close();



	}



	}

