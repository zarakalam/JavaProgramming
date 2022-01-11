package day36_Inheritance;

public class Student_Encapsulation_Review {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;


    public Student_Encapsulation_Review(String name, int age, char gender, char grade, String schoolName) {
        setName(name);;
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String toString() {
        return "Student_Encapsulation_Review{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }


    public void isStudying(){
        System.out.println(name+ " is studying");
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName(){
        return schoolName;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<5 || age >90){

            return;
        }
        this.age=age;
    }

    public void setGender(char gender) {
        if(!(gender=='M' || gender=='F')){

            return;
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if(!(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')){
            return;
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
