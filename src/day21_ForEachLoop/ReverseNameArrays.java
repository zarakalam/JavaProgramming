package day21_ForEachLoop;

public class ReverseNameArrays {
    public static void main(String[] args) {

        String[] names = {"Zarak Alam", "Yulia Shea", "Ali Kilic", "Selenium Automation", "Jonathan Holly",
                "Alshaun Rodgers"};

        for (String each : names) { // each = every single name

            String reversed ="";

            for (int i = each.length()-1; i >=0 ; i--) { // this loop will print "each" name backwards
                reversed += each.charAt(i); // this assigns that reversal
            }

            System.out.println(reversed);


        }
    }
}
