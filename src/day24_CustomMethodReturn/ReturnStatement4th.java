package day24_CustomMethodReturn;

public class ReturnStatement4th {
    public static void main(String[] args) {

        //return --> can exit the method statement, if used in the VOID method.
        // return --> otherwise is used to return data in the return method.

        nameOfTheMonth(30);



    }

    public static void nameOfTheMonth(int name) {

        if (!(name >= 1 && name <= 12)) {
            System.out.println("Invalid Month");
            return; // exits the method if statement is true.
        } else if (name == 1) {
            System.out.println("January");
        } else if (name == 2) {
            System.out.println("February");
        } else if (name == 3) {
            System.out.println("March");
        } else if (name == 4) {
            System.out.println("April");
        } else if (name == 5) {
            System.out.println("May");
        } else if (name == 6) {
            System.out.println("June");
        } else if (name == 7) {
            System.out.println("July");
        } else if (name == 8) {
            System.out.println("August");
        } else if (name == 9) {
            System.out.println("September");
        } else if (name == 10) {
            System.out.println("October");
        } else if (name == 11) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }


    }




}
