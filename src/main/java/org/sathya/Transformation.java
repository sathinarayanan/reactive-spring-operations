package org.sathya;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Transformation {

    public void transformation() {
        Flux<Integer> numbers = Flux.range(1, 10);
        System.out.println("Skipping 5 Elements");
        numbers.skip(5).subscribe(System.out::println);

        System.out.println("Skipping 5 Elements and take next 2 Elements");
        numbers.skip(5).take(2).subscribe(System.out::println);

        List<List<Integer>> block = numbers.buffer(3).collectList().block();

        System.out.println("Filter the even numbers  and  Square it");
        numbers.filter(i-> i%2 ==0 ).map(value -> value * value).subscribe(System.out::println);

        System.out.println("Filter the even numbers  and  Square it with flatmap");
        numbers.filter(i-> i%2 ==0 ).flatMap(value -> Mono.just(value * value)).subscribe(System.out::println);
    }
}
