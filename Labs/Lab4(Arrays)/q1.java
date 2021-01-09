import java.util.Scanner;

/**
 * q1
 */
public class q1 {

    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements of the matrix: ");
        int a[][] = new int[10][10];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum=sum+a[i][n-i-1];

        }
        System.out.println("The sum of non principal diagonal: "+sum);
    }
}