import java.util.Scanner;

class Student{
    int reg_no;
    String name;
    int age;
    Scanner sc = new Scanner(System.in);
    Student(){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter reg no.: ");
        reg_no = sc.nextInt();
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }
    void disp(){
        System.out.println("The semester and fees are: ");
    }
}
class UG extends Student{
    int semester;
    double fees;
    UG(){
        super();
        System.out.println("Enter semester: ");
        semester = sc.nextInt();
        System.out.println("Enter the fees: ");
        fees = sc.nextInt();
    }

    void display(){
        disp();
        System.out.println(semester);
        System.out.println(fees);
    }
}

class PG extends Student{
    int semester;
    double fees;
    PG(){
        super();
        System.out.println("Enter semester: ");
        semester = sc.nextInt();
        System.out.println("Enter the fees: ");
        fees = sc.nextInt();
    }
    void display(){
        disp();
        System.out.println(semester);
        System.out.println(fees);
    }
}






public class q2 {
    public static void main(String[] args) {
        UG ug = new UG();
        PG pg = new PG();
        ug.display();
        pg.display();
        
    }
}
