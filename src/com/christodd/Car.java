package com.christodd;

public class Car extends Vehicle {
    private int doors;
    private int trunk;

    public Car(String direction, int gear, int speed, int doors, int trunk) {
        super(direction, gear, speed);
        this.doors = doors;
        this.trunk = trunk;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getTrunk() {
        return trunk;
    }

    public void setTrunk(int trunk) {
        this.trunk = trunk;
    }

    public void doorOpen() {
        System.out.println("Car.openDoor() called");
    }

    public void doorClose() {
        System.out.println("Car.closeDoor() called");
    }

    public void trunkOpen() {
        System.out.println("Car.trunkOpen() called");
    }

    public void trunkCloses() {
        System.out.println("Car.trunkCloses() called");
    }

}
