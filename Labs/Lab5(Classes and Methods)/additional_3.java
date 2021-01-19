public class additional_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapbyvalue(a, b);
        Numbers n1 = new Numbers(10);
        Numbers n2 = new Numbers(20);
        Numbers n = new Numbers(0);
        swapbynum(n1, n2);
        System.out.println("After swapping a = "+n1.n1+" b ="+n2.n2);
        
    }
}

public static void swapbyvalue(int a, int b) {
    System.out.println("Before swapping a = "+a+" b ="+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping a = "+a+" b ="+b);
    
}

public static void swapbynum(Numbers a, Numbers b){
    Numbers temp = new Numbers();
    temp=a;
    a=b;
    b=temp;
}

class Numbers{
    int a;

    Numbers(int a){
        this.a = a;
    }
    
}