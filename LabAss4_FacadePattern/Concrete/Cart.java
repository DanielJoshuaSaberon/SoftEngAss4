package LabAss3_FacadePattern.Concrete;

import LabAss3_FacadePattern.Subsystem.*;

public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void work() {
        requestCart(numberOfCarts);

    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting to the front desk " + numberOfCarts + " cart(s)");
    }

}
