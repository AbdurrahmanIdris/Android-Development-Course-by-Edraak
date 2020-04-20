package employeedemo;

/**
 *
 * @author 20120
 */
public class Employee {
    public String name;
    private double salary;
    
    public Employee (String empName){
        name = empName;
    }
    
    public void setSalary(double empSalary){
        salary = empSalary;
    }
    
    public void printEmployee(){
        System.out.println("Name is "+name);
        System.out.println("Salary is "+salary);
    }
    
    
}
