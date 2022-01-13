package day38_InheritanceIII.CarTask;

public class BMW extends Car {

    public BMW(String brand, String model, int year, double price, String color, int miles){
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(brand+" "+model+ " is broke down");
    }

    public void racing(){
        System.out.println(brand+" "+model+ " is racing");
    }
}
