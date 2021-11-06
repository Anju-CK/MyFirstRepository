package com.in28Minutes.firstjavaproject;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(80);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.start();
        honda.start();

        // ducati.setSpeed(100);
        ducati.increaseSpeed(100);
        System.out.println(ducati.getSpeed());
        honda.increaseSpeed(100);
        System.out.println(honda.getSpeed());

        /*
         * int ducatiSpeed = ducati.getSpeed(); ducatiSpeed = ducatiSpeed + 100;
         * ducati.setSpeed(ducatiSpeed);
         */

        // honda.setSpeed(80);
        ducati.decreaseSpeed(50);
        honda.decreaseSpeed(20);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
