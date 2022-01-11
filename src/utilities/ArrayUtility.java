package utilities;

import java.util.Arrays;

public class ArrayUtility {

    //prints each integer of an integer array on a sep line.
    public static void printEach(int[] array){

        for (int each : array) {
            System.out.println(each);
        }

    }

    //prints each decimal number of an array on a sep line
    public static void printEach(double[] array){

        for (double each : array) {
            System.out.println(each);
        }

    }

    //prints each String of an array on a sep line
    public static void printEach(String[] array){

        for (String each : array) {
            System.out.println(each);
        }

    }

    //prints each char of an array on a sep line
    public static void printEach(char[] array){

        for (char each : array) {
            System.out.println(each);
        }

    }

    //returns the maximum number for an integer array
    public static int maxNumber(int[] array){

        Arrays.sort(array);
        return array[array.length-1];



        /*

        int[] array = {0,4,6,2,22,14,9};

    int max = numbers[0];

        for(int each: numbers){
            if(each > max){
                max = each;

            }

        }





         */




    }

    //returns the max nnumber for a double array
    public static double maxNumber(double[] array){

        Arrays.sort(array);
        return array[array.length-1];

    }

    //returns the min number for an integer array
    public static int minNumber (int[] array){

        Arrays.sort(array);
        return array[0];

    }

    //returns the min number for a decimal
    public static double minNumber (double[] array){

        Arrays.sort(array);
        return array[0];


        /*


        int[] numbers = {10, 5, 4, 20, 1, 3};

        int min = numbers[0];

        for(int each: numbers){
            if(each < min){
                min = each;

            }

        }

        System.out.println(min);

    }




         */




    }

    //check if the given integer is contained in the array, returns boolean
    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array) {
            if(each == element){
                result= true;
            }

        }

        return result;
    }

    //checks if the given double is contained in the array, returns boolean
    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array) {
            if(each == element){
                result= true;
            }

        }

        return result;
    }

    //checks if the given char is contained in the array
    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (char each : array) {
            if(each == element){
                result= true;
            }

        }

        return result;
    }

    //checks if the given string is contained in the given array
    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array) {
            if(each.equals(element)){
                result= true;
            }

        }

        return result;
    }

    //create a return methode that adds an integer after the last index of a double array.
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i=0;
        for (int each : array) {
            result[i++] =each;

        }

        result[i] = element;
        return result;
    }

    //create a return methode that adds an integer after the last index of a double array.
    public static double[] addElement(double[] array, double element){

        double[] result = new double[array.length + 1];
        int i =0;
        for (double each : array) {
            result[i++] =each;
        }

        result[i]=element;
        return result;

    }

    public static char[] addElement(char[] array, char element){

        char[] result = new char[array.length + 1];
        int i =0;
        for (char each : array) {
            result[i++] =each;
        }

        result[i]=element;
        return result;

    }

    public static String[] addElement(String[] array, String element){

        String[] result = new String[array.length + 1];
        int i =0;
        for (String each : array) {
            result[i++] =each;
        }

        result[i]=element;
        return result;

    }

    //prints out the frequency of an element in an array
    public static int frequencyOfElement(int[] array, int element){

        int count =0;

        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //prints out the frequency of an element in an array
    public static int frequencyOfElement(double[] array, double element){

        int count =0;

        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //prints out the frequency of an element in an array
    public static int frequencyOfElement(String[] array, String element){

        int count =0;

        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }

        return count;
    }

    //prints out the frequency of an element in an array
    public static int frequencyOfElement(char[] array, char element){

        int count =0;

        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //returns unique elements of an array
    public static int[] uniqueElements(int[] array){

        int[] result = {};

        for (int each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static double[] uniqueElements(double[] array){

        double[] result = {};

        for (double each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static char[] uniqueElements(char[] array){

        char[] result = {};

        for (char each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }

    public static String[] uniqueElements(String[] array){

        String[] result = {};

        for (String each : array) {

            if(ArrayUtility.frequencyOfElement(array,each)==1 ){
                result=ArrayUtility.addElement(result,each);
            }

        }

        return result;
    }

    //will remove a element from given index from an array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }

        return result;
    }


    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = {};

        for (String each : arr1) {
            result = ArrayUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArrayUtility.addElement(result, each);
        }

        return result;
    }

    //reverses the given array, returns a new array
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }


    //reverses the given array, returns a new array
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }

    //replace the element of the array at the given index with a new element
    public static int[] replaceElement ( int[] arr, int index, int element){

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index: " + index );
            System.exit(0);
        }
        arr[index] = element;
        return arr;


    }


    public static double[] replaceElement ( double[] arr, int index, double element){

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index: " + index );
            System.exit(0);
        }
        arr[index] = element;
        return arr;


    }


    public static char[] replaceElement ( char[] arr, int index, char element){

        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index: " + index );
            System.exit(0);
        }
        arr[index] = element;
        return arr;


    }


    public static String[] replaceElement ( String[] arr, int index, String element){

        if (index < 0 || index > arr.length - 1) {
            System.err.println("INvalid index: " + index );
            System.exit(0);
        }
        arr[index] = element;
        return arr;


    }

    //replaces all the old values with the new value in an array
    public static int[] replaceAll(int[] array, int oldValue, int newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newElement;


            }


        }

        return array;


    }

    //replaces all the old values with the new value in an array
    public static double[] replaceAll(double[] array, double oldValue, double newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newElement;


            }


        }

        return array;


    }

    //replaces all the old values with the new value in an array
    public static char[] replaceAll(char[] array, char oldValue, char newElement){

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newElement;


            }


        }

        return array;


    }

    //replaces all the old values with the new value in an array
    public static String[] replaceAll(String[] array, String oldValue, String newElement){

        for (int i = 0; i < array.length; i++) {
            if( array[i].equals(oldValue) ){
                array[i] = newElement;


            }


        }

        return array;


    }

    //removess all the duplicate elements within an array
    public static int[] removeDuplicate(int[] array){

        int[] result = {};

        for (int each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }


    //removess all the duplicate elements within an array
    public static double[] removeDuplicate(double[] array){

        double[] result = {};

        for (double each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }

    //removess all the duplicate elements within an array
    public static char[] removeDuplicate(char[] array){

        char[] result = {};

        for (char each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }

    //removess all the duplicate elements within an array
    public static String[] removeDuplicate(String[] array){

        String[] result = {};

        for (String each : array) {
            if( !ArrayUtility.contains(result, each)){
                result=ArrayUtility.addElement(result, each);
            }

        }

        return result;
    }




}
