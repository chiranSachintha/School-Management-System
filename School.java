import java.util.List;
import java.util.ArrayList;
public class School{
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }
    public int getTotalMoneyEarned(){
        return this.totalMoneyEarned;
    }
    public int getTotalMoneySpend(){
        return this.totalMoneySpent;
    }
    public static void updateTotalMoneyEarned(int studentFees){
        totalMoneyEarned=totalMoneyEarned+studentFees;
    }
    public static void updateTotalMoneySpend(int teacherSalary){
        totalMoneySpent=totalMoneySpent+teacherSalary;
    }
}
