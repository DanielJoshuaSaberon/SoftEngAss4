package LabAss3_FacadePattern.Concrete;

import LabAss3_FacadePattern.Subsystem.*;

public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void work() {
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is picking up a vehicle with plate number " + plateNumber);
    }
}
