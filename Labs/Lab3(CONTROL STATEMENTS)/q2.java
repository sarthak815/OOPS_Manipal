import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenghth: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        int circumference = 2*(l+b);
        int area = l*b;
        System.out.println("The perimeter is: "+circumference);
        System.out.println("The area is: "+area);
    }
}
