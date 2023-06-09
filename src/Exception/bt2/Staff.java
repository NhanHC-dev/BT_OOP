package workshop5p2q1;

public class Staff extends Person {
    private String school;
    private double pay;
    public Staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return super.toString()+"\nStaff{" + "school=" + school + ", pay=" + pay + '}';
    }
    public void display()
    {
        System.out.println(toString());
        System.out.println("=====================================");
    }
}
