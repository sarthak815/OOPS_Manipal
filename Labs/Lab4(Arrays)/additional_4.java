import java.util.Scanner;

public class additional_4 {
    public static void main(String[] args) {
        int a[]=new int[20];
        int b[]= new int[20];
        int c[]=new int[20];
        System.out.print("How many elements to be input to list 1: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements for list 1: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("How many elements to be input to list 2: ");
        int m = sc.nextInt();
        System.out.println("Enter elements for list 2: ");
        for(int i = 0;i<m;i++){
            b[i]=sc.nextInt();
        }
        //merging 
        int k=0;
        for(int i = n;i<n+m;i++){
            a[i]=b[k];
            k++;
        }
        //sorting
        for(int i=0;i<m+n;i++){
            int min = a[i];
            for(int j=i+1;j<m+n;j++){
                if(a[j]<min){
                    a[i]=a[j];
                    a[j]=min;
                    min=a[i];
                }
            }
        }
        System.out.println("The sorted list is: ");
        for(int i=0;i<m+n;i++){
            System.out.println(a[i]+" ");
        }
    }
    
}
