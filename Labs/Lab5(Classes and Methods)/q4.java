import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

class Complex{
    double[] sum = new double[2];
    Complex(int n, double[] d){
        sum[0] = n+d[0];
        sum[1] = d[1]; 
    }

    Complex(double[]d1, double[]d2){
        sum[0] = d1[0]+d2[0];
        sum[1]=d2[1]+d1[1];
    }

    void display(){
        System.out.println(this.sum[0]+"+i"+this.sum[1]);
    }
}



public class q4 {
    public static void main(String[] args) {
        double[] d1={22,22};
        Complex c1=new Complex(12,d1);
        c1.display();
        double[] d2={34,55};
        Complex c2=new Complex(d2,d1);
        c2.display();
    }
}
