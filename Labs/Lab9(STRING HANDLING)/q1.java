import java.util.Scanner;



public class q1 {


    static void count1(String s1){
            int words = 0;
            int lines = 0;
            int vowels = 0;
            for(int i=0; i<s1.length();i++){
                char c = s1.charAt(i);
                switch(c){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowels+=1;
                        break;
                    case '\n':
                        lines+=1;
                    case ' ':
                        words+=1;
                        break;
                }   
            }
            System.out.println("The number of characters are: "+s1.length());
            System.out.println("Number of lines:"+lines);
            System.out.println("Number of vowels:"+vowels);
            System.out.println("Number of words:"+words);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        System.out.println("Enter a string(Enter twice to stop): ");
        String s2 = new String();
        while(true){
            s2 = sc.nextLine();
            if(s2.length()==0){
                break;
            }
            s1 = s1.concat(s2);
            s1 = s1.concat("\n");
        }

        count1(s1);
    }
}

