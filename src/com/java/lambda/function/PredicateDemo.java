package com.java.lambda.function;

import java.util.function.Predicate;

class PredicateImpl implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return (integer%2 == 0);
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
//        Predicate<Integer> i = new PredicateImpl();
//        System.out.println(i.test(11));

        Predicate<Integer> predicate = i -> (i%2 == 0);
        System.out.println(predicate.test(2));
    }
}
