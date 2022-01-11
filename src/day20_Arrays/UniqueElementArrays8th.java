package day20_Arrays;

public class UniqueElementArrays8th {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad"};

        for (int j = 0; j < words.length; j++) { // this loop will run to check the frequency of the entire array

            String element = words[j]; //first element is "Java" ... have to repeat steps line 8 -13 to get the frequnecy of each word in the array
            int frequency = 0;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) { // if the word has occurred then itll add the frequency of the word by 1
                    frequency++; // this will only work for the frequency of the 1st element bc the in the element string the index you are checking is the first, hence the number 0
                }

            }

            if (frequency == 1) {
                System.out.println(element);
            }

        }



    }
}

