package day21_ForEachLoop;

public class ForEachLoopPractice7th {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds",
                            "Angry Birds"};

        for ( String each : words){
            System.out.println(each.charAt(0) + "" + each.charAt( each.length()-1)) ;
        }

    }
}

/*

print the first and the last character and print on  a sep line

 */