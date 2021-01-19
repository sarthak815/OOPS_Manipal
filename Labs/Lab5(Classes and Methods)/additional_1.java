import java.util.Scanner;

/**
 * additional_1
 */

class Result{
    int[][] a = new int[20][20];
    int[] b = new int[20];
    Scanner sc = new Scanner(System.in);
    void getmarks(){
        System.out.println("Enter marks of students 1,2,3 in subject 1: ");
        int k=0;
        for(int i=0;i<3;i++){
            a[k][i]=sc.nextInt();
        }
        k++;
        System.out.println("Enter marks of students 1,2,3 in subject 2: ");
        for(int i=0;i<3;i++){
            a[k][i]=sc.nextInt();
        }

        k++;
        System.out.println("Enter marks of students 1,2,3 in subject 3: ");
        for(int i=0;i<3;i++){
            a[k][i]=sc.nextInt();
        }
    }
    
    void getTotal(){
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                sum = sum+a[j][i];
            }
            b[i]=sum;
            sum=0;

        }
    }
    void findHighest(){
       
            int max = b[0];
            for(int i=1;i<3;i++){
                if(b[i]>max){
                    max=b[i];
                }
            }
            System.out.println("The highest marks is "+max);
        }
    
}





public class additional_1 {

    public static void main(String[] args) {
        Result re = new Result();
        re.getmarks();
        re.getTotal();
        re.findHighest();
    }
}