import java.util.Scanner;

public class additional_2 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int largest = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        int smallest = (n1<n2)?((n1<n3)?n1:n3):((n2<n3)?n2:n3);
        System.out.println("The largest number is: "+largest);
        System.out.println("The smallest number is: "+smallest);
    }
}
