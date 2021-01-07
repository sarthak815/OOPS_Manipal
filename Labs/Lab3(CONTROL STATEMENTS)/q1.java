import java.util.Scanner;

/**
 * q1
 */
public class q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int val=0;
        int temp=n;
        while(temp!=0){
            int k =temp%10;
            val=val+(k*k*k);
            temp=temp/10;
        }
        if(n==val){
            System.out.println("The value is an armstrong number");
        }
        else{
            System.out.println("The value is not");
        }
    }
}