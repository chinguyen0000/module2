package ss10_dsa_list_set.bai_tap.vehicle_management.model;

import java.time.Year;

public class Truck extends Vehicle {
    private int payload;

    public Truck(String plate, Manufacturer manufacturer, Year year, String owner, int payload) {
        super(plate, manufacturer, year, owner);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "{" +
                "plate = '" + super.getPlate() + '\'' +
                ", manufacturer ='" + super.getManufacturer() + '\'' +
                ", year ='" + super.getYear() + '\'' +
                ", owner ='" + super.getOwner() + '\'' +
                ", payload =" + getPayload() + '\'' +
                '}';
    }
}
