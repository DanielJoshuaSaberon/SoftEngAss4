package LabAss3_FacadePattern.Facade;

import LabAss3_FacadePattern.Concrete.*;
import LabAss3_FacadePattern.Subsystem.*;

public class FrontDesk {
    public void requestValetService(String plateNumber) {
        HotelService valet = new Valet(plateNumber);
        valet.work();
    }

    public void requestHouseKeeping(int roomNumber) {
        HotelService hk = new HouseKeeping(roomNumber);
        hk.work();
    }

    public void requestLuggageCart(int numberOfCarts) {
        HotelService cart = new Cart(numberOfCarts);
        cart.work();
    }
}
