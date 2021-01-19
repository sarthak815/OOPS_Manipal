import java.util.concurrent.CountDownLatch;

class Number{
    double d;

    Number(double d1){
        this.d=d1;
    }

    boolean isZero(){
        if(d==0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isPositive(){
        if(d>=0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isNegative(){
        if(d<0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isOdd(){
        if(d%2==0){
            return false;
        }
        else{
            return true;
        }
    }
    boolean isEven(){
        if(d%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isPrime(){
        if(d<2){
            return false;
        }
        else{
            for(int i=2;i<d/2;i++){
                if(d%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    
    boolean isArmstrong(){
        int arm=0;
        int n;
        int k= (int) d;

        while(k!=0){
            n = k%10;
            arm = arm + n*n*n;
            k=k/10;   
        }
        if((int)d==arm){
            return true;
        }
        else{
            return false;
        }
    }
}





public class q5 {
    public static void main(String[] args) {
        Number n1 =new Number(-153.0);
        System.out.println(n1.isEven());
        System.out.println(n1.isOdd());
        System.out.println(n1.isNegative());
        System.out.println(n1.isPositive());
        System.out.println(n1.isZero());
        System.out.println(n1.isPrime());
        System.out.println(n1.isArmstrong());
    }
}
