package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "John";
        int birthday = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        System.out.println(name + " was born on " + birthMonth + "/" + birthday + "/" + birthYear + ".");

        System.out.println("----------------------------------------------");

        //My favorite book is "bookname"

        String bookName = "Rich Dad and Poor Dad";

        System.out.println("My favorite book is \"" + bookName + "\"");


       /* byte a = 25;
        int b = a;     //smaller primitive can directly be assigned

        */






    }
}

/*
1. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
 */