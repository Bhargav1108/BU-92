package p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;

	public void carStar() {

		System.out.println("Car is statred..");
		engine.EngineStar();
	}

}
