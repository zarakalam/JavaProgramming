package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;


    public String getName(){   //getter for name variable
        return name;
    }



    public void setName(String name){   //setter for name variable
        this.name=name;
    }


    public int getAge(){    //getter for age variable
        return age;
    }

    public void setAge(int age){    //setter for age variable
        if(age <= 0 || age > 150){
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }
        this.age=age;
    }









}
