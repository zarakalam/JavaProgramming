package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Zarak", 31, 'M', 150980, "Automation Tester", 105000);

        Tester tester = new Tester("olga", 29, 'F', 2210, "SDET", 115000);

        Teacher teacher = new Teacher("Morgan", 36, 'F', 2211, "FA", 43500);

        Student student = new Student("Jaxon", 8, 'M', 2212, "Elementary Grad School");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("==============================");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);


        System.out.println("==================================");


        developer.work();
        teacher.work();
        tester.work();

        System.out.println("-==================================");

        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBug();


    }


}
