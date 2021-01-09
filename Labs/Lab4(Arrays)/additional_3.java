import java.util.Scanner;

public class additional_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.println("Enter Number of Columns: ");
        int m = sc.nextInt();
        int a[][]= new int[20][20];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter element to be found: ");
        int p = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==p){
                    count++;
                }
            }
        }
        System.out.println("The occurrences is: "+count);
    }
}
