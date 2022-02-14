package day47_Polymorphism;

import day39_Recap.cydeoTask.Employee;
import day39_Recap.cydeoTask.Tester;
import day44_AbstractionContinued_Interface.AnimalTask.Animal;
import day44_AbstractionContinued_Interface.AnimalTask.Cat;
import day44_AbstractionContinued_Interface.AnimalTask.Dog;
import day45_Abstraction_Interface.shape.Circle;
import day45_Abstraction_Interface.shape.Shape;
import day45_Abstraction_Interface.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

      //  Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog)animal; //downcasting

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        dog.bark();

        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide() );
        System.out.println("=========================================");

        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");

       //Cat cat = (Cat) animal2;
       //cat.meow();

        ((Cat) animal2).meow();
        //((Dog) animal2 ).bark(); // will get compile error because animal2 is related to Cat attributes and cat doesnt bark
        System.out.println("=======================================");

        Employee employee = new Tester("Ali", 30, 'M', 2232, "Tester", 100000);

        ((Tester)employee).work();
        ((Tester)employee).createTicket();

    }

}
