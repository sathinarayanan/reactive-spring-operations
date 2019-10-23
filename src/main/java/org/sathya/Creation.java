package org.sathya;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creation {
    public void  create() {
        Mono<String> stringMono = Mono.just("Sathya");
        stringMono.subscribe(System.out::println);

        final Flux<String> stringFlux = Flux.just("one", "Two", "Three");
        stringFlux.subscribe(System.out::println);
    }

    public void createFromArray() {
        String fruits[] = new String[] {"Apple","Orange"};
        final Flux<String> fruitsFlux = Flux.fromArray(fruits);
        fruitsFlux.subscribe(System.out::println);
    }

    public void createFromIterable() {
        List<String> fruits = Arrays.asList("Apple","Orange");
        final Flux<String> fruitsFlux = Flux.fromIterable(fruits);
        fruitsFlux.subscribe(System.out::println);
    }


    public void createFromStream() {
         final Flux<String> fruitsFlux = Flux.fromStream(Stream.of("Apple","Orange"));
        fruitsFlux.subscribe(System.out::println);
    }
}
