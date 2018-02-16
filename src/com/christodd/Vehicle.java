package com.christodd;

public class Vehicle {

    private String direction;
    private int gear;
    private int speed;

    public Vehicle(String direction, int gear, int speed) {
        this.direction = direction;
        this.gear = gear;
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called: " + speed + " mph.");
    }

    public void changeGear(int gear) {
        System.out.println("Vehicle.changeGear() called: Gear " + gear);
    }

    public void switchDirection(String direction) {
        System.out.println("Vehicle.switchDirection() called: due " + direction);
    }
}
