import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int n = sc.nextInt();
        if(n%4!=0){
            System.out.println("Its not a leap year");

        }
        else if(n%100!=0){
            System.out.println("It is a leap year");
        }
        else if(n%400!=0){
            System.out.println("It is not a leap year");
        }
        else{
            System.out.println("Its is  a leap year");
        }
    }
    
}
