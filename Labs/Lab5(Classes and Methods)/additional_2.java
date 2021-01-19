import java.util.Scanner;

class arry{
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);
    void getData(){
        System.out.println("How many numbers to be entered: ");
        int n =sc.nextInt();
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void display(){
        for(int i=0;arr[i]!='\0';i++){
            System.out.println(arr[i]);
        }
    }
    void largest(){
        int max = arr[0];
        for(int i=1;arr[i]!='\0';i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
    }

    void average(){
        int sum=0;
        int i;
        for(i = 0;arr[i]!='\0';i++){
            sum = sum+arr[i];
        }
        System.out.println("The average is: "+sum/(i+1));
    }

    void sort(){
        int n=0;
        while(arr[n]!='\0'){
            n++;
        }
        for(int i=0;i<n;i++){
            int min=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}





public class additional_2 {
    public static void main(String[] args) {
        arry a = new arry();
        a.getData();
        a.display();
        a.largest();
        a.average();
        a.sort();
        a.display();
    }
}
