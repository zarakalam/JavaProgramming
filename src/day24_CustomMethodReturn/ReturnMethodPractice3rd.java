package day24_CustomMethodReturn;

public class ReturnMethodPractice3rd {

    public static void main(String[] args) {

    //find the max number between 100 and 200
        int maxNumber = max(100,200);
        System.out.println(maxNumber);

    //multiply the max number by 2

        int multiplication= maxNumber*2;
        System.out.println("multiplication = " + multiplication);



    }

    public static int max (int num1, int num2){

        int result = 0;

        if(num1>num2){
            result =num1;
        }else{
            result=num2;
        }
        return result;
    }






}
