import java.util.Scanner;

public class q1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int b = sc.nextInt();
        int area = l*b;
        int peri = 2*(l+b);
        System.out.println("The area is: "+area);
        System.out.println("The perimeter is: "+peri);
    }
}
