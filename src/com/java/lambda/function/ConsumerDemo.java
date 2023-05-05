package com.java.lambda.function;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer = new ConsumerImpl();
//        consumer.accept("karan agrawal");

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("sweta agrawal");
    }
}
