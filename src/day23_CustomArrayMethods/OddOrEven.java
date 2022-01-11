package day23_CustomArrayMethods;

public class OddOrEven {

    public static void main(String[] args) {
        System.out.println("Test Started");
        System.out.println("-----------------");

        oddEven(10);
        System.out.println();
        System.out.println("test complete");


    }

    public static void oddEven(int num){

        if(num%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }

    }
}
