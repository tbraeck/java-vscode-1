public class Student {
   

    String name = "john";
    int roll_no = 10;
    int marks1 = 85, marks2 = 87, marks3 =96;

    int getMarks(){
        return marks1 + marks2 + marks3;
    }

    void getGrades(){
        System.out.println("Student with roll no " + roll_no + " secured A grade");
    }
public static void main(String[] args){
            Student john = new Student();
            System.out.println(john.getMarks());
            john.getGrades();
            System.out.println(john.marks1);
            System.out.println(john.name);
        }
    }
   

