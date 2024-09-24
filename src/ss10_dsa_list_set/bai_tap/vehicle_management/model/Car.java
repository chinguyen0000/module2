package ss10_dsa_list_set.bai_tap.vehicle_management.model;

import java.time.Year;

public class Car extends Vehicle {
    private int seatCount;
    private String model;

    public Car(String plate, Manufacturer manufacturer, Year year, String owner, int seatCount, String model) {
        super(plate, manufacturer, year, owner);
        this.seatCount = seatCount;
        if (model == "du lịch" || model == "xe khách") {
            this.model = model;
        } else {
            this.model = "xe khách";
        }
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString() {
        return "{" +
                "plate = '" + super.getPlate() + '\'' +
                ", manufacturer ='" + super.getManufacturer() + '\'' +
                ", year ='" + super.getYear() + '\'' +
                ", owner ='" + super.getOwner() + '\'' +
                ", number of seats =" + getSeatCount() + '\'' +
                ", model =" + getModel() + '\'' +
                '}';
    }
}
