import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to be found b/w: ");
        int m=sc.nextInt();
        int n = sc.nextInt();
        System.out.println("The prime numbers are: ");
        for(int i=m;i<=n;i++){
            boolean b = true;
            if(i==1||i==0){
                b=false;
                
            }
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    b=false;
                    break;
                }
            
            }
            if(b==true){
                System.out.println(i);
            }
        }
    }
}
