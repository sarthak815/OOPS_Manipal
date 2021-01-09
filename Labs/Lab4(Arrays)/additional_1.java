import java.util.Scanner;

public class additional_1 {
    public static void main(String[] args) {
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        System.out.println("How many numbers to be entered: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            a[i+1]='\0';
        }
        
        System.out.println("The prime numbers are: ");
        for(int i=0;a[i]!='\0';i++){
            int n1 = a[i];
            b = true;
            if(n1>=2){
                for(int j = 2;j<=n1/2;j++){
                    if(n1%j==0){
                        b = false;
                        break;
                    }
                }
                if(b==true){
                    System.out.println(n1);
                }
            }
        }
    }
}
