import java.util.Scanner;
import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str= scan.nextLine();
        int found=-1;
        for(int i=0;i<str.length();i++){
            found=str.indexOf(str.charAt(i));
            if(found!=i){
                byte[] b= new byte[str.length()];
                Arrays.fill(b,(byte)str.charAt(found));
                System.out.println(new String(b));
                break;
            }
        }
        scan.close();
    }
        
}

  
