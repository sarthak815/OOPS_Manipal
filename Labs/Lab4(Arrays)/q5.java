import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        System.out.println("Enter elements of the matrix: ");
        int a[][] = new int[10][10];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        if(m==n){
            int sum1=0;
            for(int i=0;i<n;i++){
                sum1 = sum1+a[0][i];
            }
            //checking column sums
            int sum2 = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    sum2 = sum2+a[j][i];

                }
                if(sum2!=sum1){
                    System.out.println("Its not a magic square");
                    System.exit(0);
                }
                sum2=0;
            }
            sum2=0;
            //checking rows
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    sum2 = sum2+a[i][j];

                }
                if(sum2!=sum1){
                    System.out.println("Its not a magic square");
                    System.exit(0);
                }
                sum2=0;
            }
            //checking diagonals
            sum2 =0;
            for(int i=0;i<n;i++){
                sum2=sum2+a[i][i];
            }
            if(sum2!=sum1){
                System.out.println("Its not a magic square");
                System.exit(0);
            }
            sum2 = 0;
            for(int i=0;i<n;i++){
                sum2=sum2+a[i][n-i-1];
            }
            if(sum2!=sum1){
                System.out.println("Its not a magic square");
                System.exit(0);
            }
            System.out.println("It is a magic square");
            
        }
        else{
            System.out.println("It is not a magic square");
        }

    }
}
