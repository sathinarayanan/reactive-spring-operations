package org.sathya;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

public class Combination {

    public  void combine() {
        Flux<String> numberFlux = Flux.just("one", "Two", "Three");
        Flux<String> fruitFlux = Flux.just("Apple", "Orange", "Banana");
        numberFlux.mergeWith(fruitFlux).subscribe(System.out::println);
    }

    public void zip() {
        Flux<Integer> numbers = Flux.range(1, 3);
        Flux<String> numberFlux = Flux.just("one", "Two", "Three");
        Flux<Tuple2<Integer, String>> numbersZiped = Flux.zip(numbers, numberFlux);
        numbersZiped.subscribe(element -> System.out.println("Key : " + element.getT1() + " Value : " + element.getT2()));
    }
}
