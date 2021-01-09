import java.util.Scanner;

public class additional_2 {
    public static void main(String[] args) {
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
    
        System.out.println("How many numbers to be entered: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            a[i+1]='\0';
        }
        int smallest = a[0];
        int largest = a[0];
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
            if(a[i]<smallest){
                smallest=a[i];
            }
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);
        System.out.println("The largest number is: "+largest);
    }
}
