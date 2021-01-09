import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        System.out.println("Enter elements of the matrix: ");
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        boolean b1 =true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]=a[i][j];
            }
        }
        System.out.println("The transposed matrix is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
        if(m==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]!=b[i][j]){
                        b1 = false;
                    }
                }
            }
            if(b1==true){
                System.out.println("The matrices are symmetric");
            }
            else{
                System.out.println("The matrices are not symmetric");
            }
        }
        else{
            System.out.println("The matrix is not symmetric");
        }
    



    }
}
