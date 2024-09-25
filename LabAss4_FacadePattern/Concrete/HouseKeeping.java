package LabAss3_FacadePattern.Concrete;

import LabAss3_FacadePattern.Subsystem.*;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void work() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping is going to clean room number " + roomNumber);
    }
}
