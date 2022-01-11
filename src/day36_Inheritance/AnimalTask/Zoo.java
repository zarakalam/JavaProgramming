package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max", "husky", 'M', 2, "small", "white");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();


        Cat cat = new Cat();
        cat.setInfo("lucy", "simese", 'F', 3, "small", "brown");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher khan", "bengal", 'M', 4, "large", "orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);




    }


}
