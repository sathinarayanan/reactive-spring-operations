package org.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Application {

	public static void main(String[] args) {
		final Combination combination = new Combination();
		combination.combine();

		combination.zip();
	}

}
