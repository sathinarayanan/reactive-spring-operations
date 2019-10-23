package org.sathya;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class LogicOperation {

    public void logic() {
        Flux<Integer> numbers = Flux.range(6, 10);
        Mono<Boolean> all = numbers.all(value -> value > 5);
        all.subscribe(value -> System.out.println("All numbers are Greater than 5 : " + value));

        Mono<Boolean> any = numbers.any(value -> value > 7);
        any.subscribe(value -> System.out.println("Any of one number is greater than 7 : " + value));

    }
}
