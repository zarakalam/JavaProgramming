package day32_ConstructorOverloading;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda", "Accord");

        Car car3 = new Car("Lexus", "RX350",2021 );

        Car car4 = new Car("BMW", "X6", 2020, 50_000);

        Car car5 = new Car("Volkswagon","Atlas Crosssport", 2021, 49_500, "Gray");


        System.out.println(car1);
        System.out.println("=============");
        System.out.println(car2);
        System.out.println("==============");
        System.out.println(car3);
        System.out.println("===============");
        System.out.println(car4);
        System.out.println("================");
        System.out.println(car5);








    }



}
