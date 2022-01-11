package day29_ArrayListPt2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));  //---------> addAll method.


        System.out.println("addAll Method result: ");
        System.out.println(list);
        System.out.println("==========================");


        list.removeAll( Arrays.asList(3,5,8) );  //------> remove all method.


        System.out.println("removeAll Method result: should have removed 3,5 & 8");
        System.out.println(list);
        System.out.println("==================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900) );
        //want to remove any digit that is not 100/200/300....
        numbers.retainAll( Arrays.asList(100,200,300) );  //----------------------------------->>> RetainAll Method:

        System.out.println("retainAll Method result: should give you only 100/200 or 300");
        System.out.println(numbers);
        System.out.println("=========================================");


        //Practice Question: Write the program to keep the following job titles QA and SDET only:

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA") );
        jobTitles.retainAll( Arrays.asList("QA", "SDET") );

        System.out.println("Practice Question: Write the program to keep the following job titles QA and SDET only: ");
        System.out.println(jobTitles);
        System.out.println("=====================================");


        //Check to see if the number 10 is contained in the array list:

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);     //--------------------------------->> Contains method:

        boolean r2 = nums.containsAll( Arrays.asList(2,5,10) );  //------------------>>> ContainsAll Method:


        System.out.println("Check to see if the number 10 is contained in the array list: Ans:(r1) " + "\n" +
                            "Check to see if the numbers 2,5 & 10 is contained in the array list: Ans(r2) ");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("==============================");


        //Two possible solutions to convert a non primitive array to an array list.

        String[] names = {"JOsh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );

        //ArrayList<String> namesList = new ArrayList<>( Arrays.asList(names) );
        System.out.println("===========================");








    }


    public static ArrayList<Integer> covertArrayToArrayList(int[] array){

        ArrayList<Integer> list1 =new ArrayList<>();

        for (int each : array) {
            list1.add(each);
        }

        return list1;

    }
}
