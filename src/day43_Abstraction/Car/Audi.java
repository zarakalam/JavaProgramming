package day43_Abstraction.Car;

public final class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }


    public void start(){
        System.out.println("Push to start");
    }

    public void autopark(){
        System.out.println(getBrand()+" "+getModel()+" "+ "has auto park feature");
    }

}
