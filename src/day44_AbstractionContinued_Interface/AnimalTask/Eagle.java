package day44_AbstractionContinued_Interface.AnimalTask;

public final class Eagle extends Animal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a snake");
    }
}