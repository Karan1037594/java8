package com.java.lambda.methodref;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}
public class MethodReferencesDemo {
    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }
    public static int addtion(int a, int b){
        return (a+b);
    }
    public static void main(String[] args) {
        // 1. Method Reference to a static method.
        // lambda expression
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // using method reference
        Function<Integer, Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(9));

        // lambda expression
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a,b) -> MethodReferencesDemo.addtion(a,b);
        System.out.println(biFunctionLambda.apply(10,11));

        // using method reference
        BiFunction<Integer, Integer, Integer> biFunction = MethodReferencesDemo::addtion;
        System.out.println(biFunction.apply(10,20));

        // 2. Method reference to an instance method of an object
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

        // lambda expression
        Printable printable = msg -> methodReferencesDemo.display(msg);
        printable.print("Hello World!");

        // using method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("Hello Karan!");

        // 3. Reference to the instance method of an arbitrary object
        // Sometime, we call a method of argument in the lambda expression.
        // In that case, we can use a method reference  to call an instance
        // method of an arbitrary object of a specific type.

        Function<String, String> stringFunction = input -> input.toLowerCase();
        System.out.println(stringFunction.apply("Java 8 Demos"));

        // using method reference
        Function<String, String> stringFunctionMethodRef = String::toLowerCase;
        System.out.println(stringFunctionMethodRef.apply("Java 8 Demos"));

        String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};

        // using lambda
        Arrays.sort(strArray, (s1,s2) -> s1.compareToIgnoreCase(s2));

        // using method reference
        Arrays.sort(strArray, String::compareToIgnoreCase);

        // 4. reference to a constructor
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("banana");

        Function<List<String>, Set<String>> setFunction = fruitList -> new HashSet<>(fruitList);
        System.out.println(setFunction.apply(fruits));

        // using method reference
        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));
    }
}
