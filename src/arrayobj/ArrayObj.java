package arrayobj;

public class ArrayObj {

    public static void main(String[] args) {

          int [] array = new int[2];
          array[0] = 10;
          array[1] = 20;

        Employee [] e1 = new Employee[3];
        e1[0] = new Employee(1, "Sara", "Lect", 1000);
        e1[1] = new Employee(2, "Moha", "Dev", 1000);
        e1[2] = new Employee(3, "A", "A", 1000);
        
        
        Employee e2 = new Employee();
        for(Employee e : e1) {
            e.printInfo();
        }

    }
    
}
