import java.util.Scanner;

public class additional_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of a and b: ");
        int a = sc.nextInt();
        int b =sc.nextInt();
        System.out.println("(a << 2) + (b >> 2) ="+(a << 2) + (b >> 2));
        System.out.println("(b > 0)= "+(b > 0));
        System.out.println("(a + b * 100) / 10 ="+(a + b * 100) / 10);
        System.out.println("a & b = "+ (a&b));
    }
}
