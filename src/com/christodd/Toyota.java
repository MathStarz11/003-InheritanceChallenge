package com.christodd;

public class Toyota extends Car {
    private String engineType;
    private String seatStyle;
    private String manufacturer;

    public Toyota(int gear, int speed, int doors, String engineType, String seatStyle) {
        super("Any", gear, speed, doors, 1);
        this.engineType = engineType;
        this.seatStyle = seatStyle;
        this.manufacturer = "Japan";
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getSeatStyle() {
        return seatStyle;
    }

    public void setSeatStyle(String seatStyle) {
        this.seatStyle = seatStyle;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void move(int speed) {
        System.out.println("Toyota.move() called: " + speed + " mph.");
    }
}
