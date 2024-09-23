package se.oscar.toString;

public class Apartment {
    private String address;
    private int floor;
    private double rent;

    public Apartment(String address, int floor, double rent) {
        this.address = address;
        this.floor = floor;
        this.rent = rent;
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }

    public double getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "address='" + address + '\'' +
                ", floor=" + floor +
                ", rent=" + rent +
                '}';
    }
}
