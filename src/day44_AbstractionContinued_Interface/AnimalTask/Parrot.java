package day44_AbstractionContinued_Interface.AnimalTask;

public final class Parrot extends Animal implements Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a cracker");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is flying in the forrest");
    }
}
