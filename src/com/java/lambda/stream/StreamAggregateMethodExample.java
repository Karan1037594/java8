package com.java.lambda.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamAggregateMethodExample {
    public static void main(String[] args) {
        // count(), min() and max() method
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println(stream.count());

        Integer integer = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min => "+integer);

        Integer integer1 = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max => "+integer1);
    }
}
