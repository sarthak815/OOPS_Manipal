import java.util.Scanner;



public class additional_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose square is to be found: ");
        double n = sc.nextDouble();
        double k = square(n);
        System.out.println("The square is: "+k);
    }

    public static double square(double n) {
        return n*n;
        
    }
}


