public class q4 {
    public static void main(String[] args) {
        int x =10;
        double y = x;
        System.out.println(y);

//The following lines cause code to crash as double cant be converted to int
        double j = 10.5;
        int k=j;
        System.out.println(k);


        double p = 10.5;
        int q = (int) p;
        System.out.println(q);
    }
}
