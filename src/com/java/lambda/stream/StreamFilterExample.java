package com.java.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        for(Product product : getProducts()){
            if(product.getPrice() > 25000){
                list.add(product);
            }
        }
        for(Product product : list){
            System.out.println(product);
        }
        System.out.println("------------------------------------------------------------------");
        // using stream API
        List<Product> list2 = getProducts()
                .stream()
                .filter(product -> product.getPrice()>25000)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");



    }

    private static List<Product> getProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000));
        productList.add(new Product(2, "Dell Laptop", 30000));
        productList.add(new Product(3, "lenovo Laptop", 28000));
        productList.add(new Product(4, "Sony Laptop", 28000));
        productList.add(new Product(5, "Apple Laptop", 90000));

        return productList;
    }
}
 class Product{
    private int id;
    private String name;
    private double price;

     public Product(int id, String name, double price) {
         this.id = id;
         this.name = name;
         this.price = price;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", price=" + price +
                 '}';
     }
 }
