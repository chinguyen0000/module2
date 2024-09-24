package ss10_dsa_list_set.bai_tap.vehicle_management.model;

import java.time.Year;

public abstract class Vehicle {
    private String plate;
    private Manufacturer manufacturer;
    private Year year;
    private String owner;

    Vehicle(String plate, Manufacturer manufacturer, Year year, String owner) {}

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract String toString();
}
