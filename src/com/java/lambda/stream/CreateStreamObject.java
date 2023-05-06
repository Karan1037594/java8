package com.java.lambda.stream;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {
    public static void main(String[] args) {

        // create a stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        // create a stream from source
        Collection<String> collection = Arrays.asList("Java","J2ee", "Hibernate","spring");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        List<String> list = Arrays.asList("Java","J2ee", "Hibernate","spring");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream3 = set.stream();
        stream3.forEach(System.out::println);

        String[] str = {"a","b","c"};
        Stream<String> stream4 = Arrays.stream(str);
        stream4.forEach(System.out::println);
    }
}
