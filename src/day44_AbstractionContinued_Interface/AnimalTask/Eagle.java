package day44_AbstractionContinued_Interface.AnimalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is flying up high in the sky");
    }
}
