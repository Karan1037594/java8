package com.java.lambda.defaultstatic;

interface Vehicle{
    String getbrand();
    String SpeedUp();
    String slowDown();

    default String turnAlarmOn(){
        return "turning vehicle alarm on";
    }
    default String turningAlarmOff(){
        return "turning vehicle alarm off";
    }
}
class Car implements Vehicle{

    @Override
    public String getbrand() {
        return "BMW";
    }

    @Override
    public String SpeedUp() {
        return "Car is speeding up";
    }

    @Override
    public String slowDown() {
        return "Car is slowing down";
    }
}
public class DefaultDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println(vehicle.getbrand());
        System.out.println(vehicle.SpeedUp());
        System.out.println(vehicle.slowDown());

        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turningAlarmOff());
    }
}
