package com.christodd;

public class Main {

    public static void main(String[] args) {

        Toyota myCar = new Toyota(5,120,2,"6 Cylinder","Black on Black Leather");
        System.out.println(myCar.getManufacturer());
        System.out.println(myCar.getEngineType());
        System.out.println(myCar.getSeatStyle());
        myCar.trunkOpen();
        myCar.changeGear(4);
    }
}
