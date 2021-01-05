import java.util.Scanner;

public class additional_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int fact=1;
        while(n>0){
            fact = fact*n;
            n=n-1;
        }
        System.out.println("The factorial is: "+fact);
    }
}
