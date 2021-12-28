package springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springJdbc.dao.studentDAO;
import springJdbc.data.Student;

public class Main {
	
	public static void main(String[] args) {

		// IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);

		studentDAO studentDao = context.getBean(studentDAO.class);

		Student s=new Student();

		s.setRollno(9);
		s.setName("Ashok");
		s.setMobile("9935678939");
		
		studentDao.get(5);
		studentDao.getAll();
		

	}
}
