public class q3 {
    public static void main(String[] args) {
        Integer a= new Integer(10); //Boxing
        Integer x=5; //Autoboxing
        x+=10;
        int c=x; 
        System.out.println("Boxed Value: "+a);
        System.out.println("Autoboxed Value: "+x);
        System.out.println("Unboxed Value: "+c);
    }
}
