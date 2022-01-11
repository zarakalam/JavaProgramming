package day30_CustomClasses;

public class EmployeeObjects_9th {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true);
        employee2.setInfo("Anna", 'F', 28, 2287, "QA", 85000, true);
        employee3.setInfo("David", 'M', 35, 2256, "QA", 45000, false);
        employee4.setInfo("Lina", 'F', 45, 2290, "Manager", 80000, true);
        employee5.setInfo("Kevin", 'M', 35, 2298, "Senior QA", 110000, true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        // check to see how many are full time employees and max salary:
        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee each : employees) {

            if(each.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(each.salary>max){
                max=each.salary;
            }

            if(each.salary<min){
                min=each.salary;
            }



        }


        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }



}
