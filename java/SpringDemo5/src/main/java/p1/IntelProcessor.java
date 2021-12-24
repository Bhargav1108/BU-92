package p1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class IntelProcessor implements Processor {

	public void start() {
		System.out.println("Intel processor is running...");

	}

}
