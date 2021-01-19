import java.util.Scanner;

class Employee{
    String name, city;
    double salary=0, allowance=0, rent=0, total=0;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        name = sc.nextLine();
        System.out.println("Enter city name: ");
        city = sc.nextLine();
        System.out.println("Enter Salary amount: ");
        salary = sc.nextDouble();
        System.out.println("Enter the allowance amount: ");
        allowance = sc.nextDouble();
        System.out.println("Enter rent amount: ");
        rent = sc.nextDouble();
    }
    void calculate(){
        total = salary+(salary*(allowance/100))+(salary*(rent/100));
    }
    void display(){
        System.out.println("The total salary is: "+total);
    }
}

public class q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getData();
        e1.calculate();
        e1.display();
        
    }
}
