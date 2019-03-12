public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.id= id;
        this.name=name;
        this.grade=grade;
        
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }
    
    public void payFees(int fees){
        feesPaid=feesPaid+fees;
        School.updateTotalMoneyEarned(fees);
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
}