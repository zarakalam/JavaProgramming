package day24_CustomMethodReturn;

public class ReturnMethodIntro2nd {

    public static void main(String[] args) {
        String str = "Java";

        String result = reverse(str);
        System.out.println(result);

        if(str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }

    }

    public static String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }




}
