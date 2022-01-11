package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomClass_DogObjects_3rd {

    public static void main(String[] args) {

        CustomClass_Dog_2nd dog1 = new CustomClass_Dog_2nd();

        dog1.name= "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        CustomClass_Dog_2nd dog2 = new CustomClass_Dog_2nd();
        dog2.name= "Ace";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "Black & White";

        CustomClass_Dog_2nd dog3 = new CustomClass_Dog_2nd();
        dog3.setInfo("Jack", "german shepherd", 2, 'M', "large", "black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        CustomClass_Dog_2nd dog4 = new CustomClass_Dog_2nd();
        dog4.setInfo("Yari", "Belgian Malinois", 2, 'M', "Medium", "Sable");
        CustomClass_Dog_2nd dog5 = new CustomClass_Dog_2nd();
        dog5.setInfo("Monza", "Belgian Malinois", 15, 'F', "medium", "brown" );

        System.out.println("====================================================");

        CustomClass_Dog_2nd[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<CustomClass_Dog_2nd> femaleDogs = new ArrayList<>();

        femaleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5) );
        femaleDogs.removeIf(p -> p.gender=='M');

        System.out.println(femaleDogs);

        ArrayList<CustomClass_Dog_2nd> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5) );
        maleDogs.removeIf(p -> p.gender=='F');

        System.out.println(maleDogs);







    }


}
