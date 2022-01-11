package day24_CustomMethodReturn;

public class MorningWarmUpTasks {

    public static void main(String[] args) {

        System.out.println("Run Test(s):");
        System.out.println();
        System.out.println();

        System.out.println("Initials Test:");
        initials("Morgan", "Hill");
        System.out.println("==================");
        System.out.println("Email Domain Test:");
        email("Cydeo.School@yahoo.com");
        System.out.println("==================");
        System.out.println("Days in a Month Test:");
        daysInAMonth(6);
        System.out.println("======================");

        System.out.println("String email domain test:");
        //Print the email domain from a string array of data.
        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "elminur@cydeo.com", "gulsen@gmail.com"};

        //call the domain test i.e email( {enter array variable name} [0]) = email( emails[0] )
        // this is will print out the first elements domain,,, repeat this step however many times to execute the entire # of data
        // i.e create a loop.

        for (String each : emails) {
            email(each); // to print out each elements' domain in the array.

        }
        System.out.println("==============================");
        System.out.println("Name of Month Test");
        nameOfTheMonth(8);
        System.out.println("===============================");
        System.out.println("Day of the week Test");
        nameOfTheDay(4);

    }


    public static void initials(String first, String last) {

        char firstInitial = first.charAt(0);
        char lastInitial = last.charAt(0);

        String initial = firstInitial + "." + lastInitial;

        System.out.println(initial);
    }


    public static void email(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf(".")); // just remove the last index of and itll print yahoo.com
        System.out.println(domain);

    }

    public static void daysInAMonth(int month) {

        int year = 2021;
        String result = "";

        if (!(month >= 1 && month <= 12)) {
            result = "Invalid Month";
        } else if (month == 2 && year % 4 == 0) {
            result = "29 days";
        } else if (month == 2 && !(year % 4 == 0)) {
            result = "28 days";
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            result = "30 days";
        } else {
            result = "31 Days";
        }

        System.out.println(result);

    }

    public static void nameOfTheMonth(int name) {

        if (!(name >= 1 && name <= 12)) {
            System.out.println("Invalid Month");
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

    public static void nameOfTheDay(int day){

        if( !(day>=1 && day<=12)){
            System.out.println("Invalid entry");
        }else if(day==1){
            System.out.println("Monday");
        }else if(day==2) {
            System.out.println("Tuesday");
        }else if(day==3) {
            System.out.println("Wednesday");
        }else if(day==4) {
            System.out.println("Thursday");
        }else if(day==5) {
            System.out.println("Friday");
        }else if(day==6) {
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }

    }



}





