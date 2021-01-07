import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int[] a = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers to be inserted: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to be found: ");
        int k = sc.nextInt();
        System.out.println("The locations where it is found: ");
        for(int j=0;j<n;j++){
            if(a[j]==k){
                System.out.println(j);
            }
        }
    }
}
