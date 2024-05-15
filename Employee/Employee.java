package Employee;

public class Employee {
    private double salary;
    public Employee(double amount){
        salary = amount;
    }
    public void increase(double more){
        if(more>0){
            salary = more+salary;
        }
    }
    public double getPay(){
        return salary;
    }
}
