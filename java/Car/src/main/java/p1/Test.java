package p1;

import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class Test {
	
	public static void main(String[] args) {
		
		
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
	Car car=context.getBean(Car.class);
	car.carStar();
		
		
	}

}
