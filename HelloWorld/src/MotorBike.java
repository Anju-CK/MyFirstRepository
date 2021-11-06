package com.in28Minutes.firstjavaproject;

public class MotorBike {

    private int speed;

    public MotorBike(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike Started");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public void increaseSpeed(int howmuch) {
        setSpeed(this.speed + howmuch);
    }

    public void decreaseSpeed(int howmuch) {
        setSpeed(this.speed - howmuch);
    }

}
