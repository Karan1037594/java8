package com.java.lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        
        String email = "karan@gmail.com";
        String name = "karan";
        
        // of, empty, ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> email1Optional = Optional.of(email);
        System.out.println(email1Optional);

        Optional<String> stringOptional = Optional.ofNullable(name);
        String defaultOptional = stringOptional.orElse("defaukt@gmail.com");
        System.out.println(defaultOptional);

        String defaultOptional2 = stringOptional.orElseGet(() -> "default2@gmail.com");
        System.out.println(defaultOptional2);

        String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("name is not exits"));
        System.out.println(optionalObject);

        // ifPresent
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptional1 = Optional.empty();

        gender.ifPresent((s) -> System.out.println("value is present"));
        emptyOptional1.ifPresent((s) -> System.out.println("no value is present"));

        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }else {
            System.out.println("no value present");
        }

        String result = " abc ";
        if(result != null && result.contains("abc")){
            System.out.println(result);
        }

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(str -> str.contains("abc"))
                .map(String::trim)
                .ifPresent(str -> System.out.println(str));

        // map method in optional provides a way to transfer value in optional from one type to another

    }
}
