import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
     System.out.println("Enter number: ");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k=n>>1;
     int j = n<<1;
     System.out.println("The product is: "+j);
     System.out.println("The quotient is: "+k);
    }
}
