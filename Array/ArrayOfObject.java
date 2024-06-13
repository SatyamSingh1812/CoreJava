package Array;
class Student
{
    int rollNo;
    String name;
    int age;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Student S1= new Student();
        S1.rollNo = 1;
        S1.name = "Satyam";
        S1.age = 25;

        Student S2= new Student();
        S2.rollNo = 2;
        S2.name = "Shreya";
        S2.age = 25;

        Student S3= new Student();
        S3.rollNo = 3;
        S3.name = "Amneet";
        S3.age = 23;
        //Here I have created array of students

        Student students[]= new Student[3];
        //Here i have assigned index to each object
        students[0]=S1;
        students[1]=S2;
        students[2]=S3;
        System.out.println("RollNo"+" "+ "Name "+" " + " Age");

        for (int i=0;i<students.length;i++)
        {

            System.out.println(students[i].rollNo+" "+ students[i].name+" "+ students[i].age);
        }


    }
}
