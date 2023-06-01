package arrayobj;

public class Employee {
    
    
    public int id;
    public String name;
    public String job;
    public double salary;
    
    public Employee(int id, String n, String j, double s) {
        this.id = id;
        name = n;
        job = j;
        salary = s;
    }
    
    public Employee() {
        
    }
    
    public void printInfo() {
        System.out.printf("ID: %d | Name: %s | Job: %s | Salary: %f\n",id, name, job, salary);
    }
    
}
