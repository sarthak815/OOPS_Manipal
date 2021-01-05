import java.util.Scanner;

public class additional_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table to be printed: ");
        int n = sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }
}
