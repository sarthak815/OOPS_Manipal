import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        int pos=0,neg=0,zero=0;
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n>0){
                pos=pos+1;
            }
            else if(n==0){
                zero=zero+1;
            }
            else{
                neg=neg+1;
            }
        }
        System.out.println("The number of positive, negative and zero values are: "+pos+" "+neg+" "+zero);
    }
}
