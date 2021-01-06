import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter a int, double and char");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);
        byte b = (byte)n;
        int n1 = (int) c;
        byte bd = (byte) d;
        int nd = (int) d;
        System.out.println("Int to byte: "+b);
        System.out.println("char to int: "+n1);
        System.out.println("Double to byte: "+bd);
        System.out.println("Double to int: "+nd);
        sc.close();
    
    
    
    }
}
