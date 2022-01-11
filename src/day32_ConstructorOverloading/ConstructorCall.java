package day32_ConstructorOverloading;

public class ConstructorCall {


    //you can only call 1 constructor at a time.

    public ConstructorCall(){
        System.out.println("Default Constructor");
    }

    public ConstructorCall(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCall(String str){
        this(10);

        System.out.println("constructor with string argument");
    }


    public static void main(String[] args) {

        ConstructorCall obj1 = new ConstructorCall();

        System.out.println("===================================");

        ConstructorCall obj2 = new ConstructorCall(10);

        System.out.println("=====================================");

        ConstructorCall obj3 = new ConstructorCall("Java");



    }




}
