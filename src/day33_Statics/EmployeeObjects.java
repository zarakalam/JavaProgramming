package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.name="Zbo";
        employee1.salary= 110000;

        Employee employee2 = new Employee();
        employee2.name="Zarooki";
        employee2.salary= 115000;

        Employee employee3 = new Employee();
        employee3.name="ZacharyBeans";
        employee3.salary= 120000;


        System.out.println(employee1.name+ " : "+employee1.salary);
        System.out.println(employee2.name+ " : "+employee2.salary);
        System.out.println(employee3.name+ " : "+employee3.salary);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);




    }


}
