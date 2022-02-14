package day47_Polymorphism;

import day44_AbstractionContinued_Interface.AnimalTask.Animal;
import day44_AbstractionContinued_Interface.AnimalTask.Dog;
import day45_Abstraction_Interface.shape.Circle;
import day45_Abstraction_Interface.shape.Shape;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

      //  Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog)animal; //downcasting

        System.out.println(animal.getName());
        System.out.println(dog.getName());

        dog.bark();
    }

}
