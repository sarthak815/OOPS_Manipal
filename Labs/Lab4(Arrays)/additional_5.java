import java.util.Scanner;

public class additional_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int m = sc.nextInt();
        int a[][]= new int[20][20];
        System.out.println("Enter the elements: ");
        double norm = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                norm = norm + Math.pow(a[i][j], 2);
            }
        }
        int trace=0;
        
        for(int i=0;i<n;i++){
            trace = trace+a[i][i];
            
        }
        
        norm=Math.sqrt(norm);
        System.out.println("The trace is: "+ trace);
        System.out.println("The norm is: "+norm);
    }
}
