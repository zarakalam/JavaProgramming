package day15_ForLoop;

public class FullName {
    public static void main(String[] args) {

        String firstName = "cyDEo";
        String lastName = "SCHOOL";

        firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        // first part gives me C  + 2nd part gives me "ydeo"

        lastName= lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();


        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println("================================");
    }
}
