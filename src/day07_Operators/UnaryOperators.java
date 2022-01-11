package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println( num1 < 0 ); //false
        System.out.println( num2 < 0 ); //true

        System.out.println("-----------------------------");

        int a = 5;
        ++a; // pre increment : increase value by 1 immediately
        System.out.println(a);

        --a; // pre decrement: decrease the value by 1 immediately

        System.out.println(a);
        System.out.println("----------------------");

        int b = 100;
        System.out.println(++b); //pre increment: changes value by +1

        int c = 100;

        System.out.println(c++); //** post increment: first outputs initial value, then next line thereafter it will increase it by 1
        System.out.println(c); // 101

        System.out.println("------------------------------");

        int x = 200;

        System.out.println(--x); // will output 199 due to it being PRE increment
        System.out.println("-------");

        int y = 200;

        System.out.println(y--);
        System.out.println(y);

        System.out.println("----------------");

        int z = 45;

        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        System.out.println("------------");

        int q = 30;

        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);




    }
}
