import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        System.out.println("Enter elements of the matrix: ");
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        
        int prod[][]=new int[10][10];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter number of rows of matrix 2: ");
        int p = sc.nextInt();
        System.out.println("Enter number of columns of matrix 2: ");
        int q = sc.nextInt();
        System.out.println("Enter elements of matrix 2: ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                b[i][j]=sc.nextInt();
            }
        }
        if(n==p&&m==q){
            System.out.println("The sum is: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                   System.out.print(a[i][j]+b[i][j]+" ");
            
                }
                System.out.println("");
            }
            int sum1=0;
            System.out.println("The product is: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<q;j++){
                    for(int k=0;k<p;k++){
                        sum1 = sum1 + a[i][k]*b[k][j];
                    }
                    prod[i][j]=sum1;
                    sum1=0;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<q;j++){
                    System.out.print(prod[i][j]+" ");
                }
                System.out.println("");
            }
            
        }
        else if(m==p){
            System.out.println("The sum is not possible as their sizes are not equal");
            System.out.println("The product is: ");

            int sum1=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<q;j++){
                    for(int k=0;k<p;k++){
                        sum1 = sum1 + a[i][k]*b[k][j];
        
                    }
                    prod[i][j]=sum1;
                    sum1=0;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<q;j++){
                    System.out.print(prod[i][j]+" ");
                }
                System.out.println("");
            }

        }
        else{
            System.out.println("The dimensions are not applicable for sum or produt");
        }
    }
}
