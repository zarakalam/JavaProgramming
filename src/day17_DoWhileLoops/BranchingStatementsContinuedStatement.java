package day17_DoWhileLoops;

public class BranchingStatementsContinuedStatement {

    public static void main(String[] args) {

        //task print all characters except C

        for (char i = 'A'; i <= 'E'; i++){

            if(i=='C'){
                continue;
            }

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("================================");

        //print only even numbers

        for( int i = 1 ; i <=10 ; i+=1){

            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("==================================");

        // print only odd numbers

        for(int i = 1; i <=10 ; i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+ " ");
        }



    }
}
