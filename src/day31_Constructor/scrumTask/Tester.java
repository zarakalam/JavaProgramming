package day31_Constructor.scrumTask;

public class Tester {

    public String name, jobTitle;
    public int employeeID;
    public double salary;


    public Tester(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary= $" + salary +
                '}';
    }



    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }




}
