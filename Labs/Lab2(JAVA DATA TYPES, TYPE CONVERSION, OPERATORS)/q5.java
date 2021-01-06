import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        char ans = 'n';
        do{
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
    
        float f1 = sc.nextFloat();
        System.out.println("Enter the operator: ");
        char c = sc.next().charAt(0);

        System.out.println("Enter second number: ");
        float f2 = sc.nextFloat();
        System.out.print("The result: ");
        
        switch(c){
            case '+':
            System.out.println(f1+f2);break;

            case '-':
            System.out.println(f1-f2);break;

            case '*':
            System.out.println(f1*f2);break;

            case '/':
            System.out.println(f1/f2);break;
            
        }
        System.out.print("Do you wish to continue(y/n): ");
        ans = sc.next().charAt(0);
    
    
        }while(ans=='y');
        
    }
}
