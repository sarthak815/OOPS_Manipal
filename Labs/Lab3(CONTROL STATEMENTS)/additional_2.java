import java.util.Scanner;

public class additional_2 {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z=1;
        for(int i=1;i<=2*b-1;i=i+2){
            int fact =1;
            for(int j=1;j<=i;j++){
                fact=fact*j;
            }
            double a1=Math.pow(a, i)/fact;
            z=z+1;
            double sum1=Math.pow(-1, z);
            System.out.println(a1*sum1);


            int sum=0;
            for(i=1;i<=b;i++)
                sum=sum+(1/i*i);
            System.out.println(sum);
        }
        
        
    }
}
