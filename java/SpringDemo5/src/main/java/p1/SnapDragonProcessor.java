package p1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SnapDragonProcessor implements Processor {

	public void start() {
		System.out.println("SnapDragon processor is running...");

	}

}


