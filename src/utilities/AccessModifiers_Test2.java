package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        // cant access default modifier outside the package
        // cant access private modifier outside the class or package


        AccessModifiers.method1();

    }


}
