package LabAss3_FacadePattern;

import java.util.*;
import LabAss3_FacadePattern.Facade.*;

public class HotelApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        FrontDesk fd = new FrontDesk();
        int choice;

        do {
            System.out.println("1. Request Valet Service");
            System.out.println("2. Request Housekeeping");
            System.out.println("3. Request Luggage Cart");
            System.out.println("4. Exit");
            System.out.print("Choose a service to request: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle plate number: ");
                    String plateNumber = sc.nextLine();
                    fd.requestValetService(plateNumber);
                    break;

                case 2:
                    System.out.print("Enter room number: ");
                    int roomNumber = sc.nextInt();
                    fd.requestHouseKeeping(roomNumber);
                    break;

                case 3:
                    System.out.print("Enter number of luggage carts: ");
                    int numberOfCarts = sc.nextInt();
                    fd.requestLuggageCart(numberOfCarts);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
