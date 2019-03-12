import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Teacher prasanka = new Teacher(001,"prasanka samaraweera",20000);
        Teacher kasun = new Teacher(002,"kasun withana",10000);
        Teacher upeksha= new Teacher(003, "nayani upeksha",20000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(prasanka);
        teacherList.add(kasun);
        teacherList.add(upeksha);


        Student lahiru = new Student(001,"lahiru sampath",4);
        Student naveen = new Student(002,"naveen",3);
        Student damith = new Student(003,"damith naveen",3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(lahiru);
        studentList.add(naveen);
        studentList.add(damith);

        School rahula = new School(teacherList,studentList);
        System.out.println(rahula.getTotalMoneyEarned());

        damith.payFees(5000);
        System.out.println(rahula.getTotalMoneyEarned());

        kasun.receiveSalary(10000);
        System.out.println(rahula.getTotalMoneySpend());

        System.out.println(kasun);

    }
}