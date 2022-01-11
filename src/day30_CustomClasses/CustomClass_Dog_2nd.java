package day30_CustomClasses;

public class CustomClass_Dog_2nd {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {
        return "CustomClass_Dog_2nd{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    /* public String toString(){
        return "Name: "+ name;
    }

    */

}
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */

