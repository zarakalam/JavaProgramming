package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
            //System.exit(0) --> only way to prevent Finally block from being executed
        }finally {
            System.out.println("Finally block");
        }





    }

}
