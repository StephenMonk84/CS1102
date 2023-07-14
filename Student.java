public class Student extends Person {
    float gpa;
    
    Student(int stuID, String name, String bDay, float gpa){
        super(stuID, name, bDay);
        this.gpa = gpa;
    }

    void displayStudent(){
        System.out.println("The student " + id +" "+ name +"'s gpa is " + gpa + " their birthday is " + bDay);
    }
    void modifySuper(){
        super.name = "Carl";
        System.out.println("The new student's name is " +super.name);
    }
}
