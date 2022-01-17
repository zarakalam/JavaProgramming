package day39_Recap.cydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    // encapsulation = creating the getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name==null){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0 || age>=100){
            System.err.println("invalid age: "+ age);
            System.exit(1);
        }
        this.age=age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( ! (gender=='M' || gender=='F') ){
            System.err.println("invalid gender: "+ gender);
            System.exit(1);
        }
        this.gender=gender;
    }

    // constructor
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
