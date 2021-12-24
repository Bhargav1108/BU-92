package p1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AmdProcessor implements Processor {

	public void start() {
		System.out.println("Amd processor is running...");

	}

}