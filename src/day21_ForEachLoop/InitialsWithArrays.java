package day21_ForEachLoop;

public class InitialsWithArrays {
    public static void main(String[] args) {

        String[] classmates = {"Zarak Alam", "Yulia Shea", "Ali Kilic", "Selenium Automation", "Jonathan Holly",
                                "Alshaun Rodgers"};

        for (String each : classmates) {
            String initial = each.charAt(0)+"."+ each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);
        }
    }
}
