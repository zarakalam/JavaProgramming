package day38_InheritanceIII.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        BMW bmw1 = new BMW("325i", 2021, 34995, "black", 25);

        Tesla tesla = new Tesla("Model S", 2022, 39999, "White", 250);


        System.out.println(bmw1);
        System.out.println(tesla);


        tesla.start();
        bmw1.start();

    }
}
