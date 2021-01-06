public class additional_3 {
    public static void main(String[] args) {
        
        //none of the code work since boolean cant be converted to int 
        
        boolean x = true;
        int y = x;
        System.out.println(y);
        boolean x1 = true;
        int y1 = (int)x1;
        System.out.println(y1);
    }
}
