
class Time{

    int hours, minutes, seconds;

    Time(){
        hours=minutes=seconds=0;
    }
    Time(int h, int m, int s){
        hours=h;
        minutes=m;
        seconds=s;
    }
    void display(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }

    void add(Time t1, Time t2){
        int s=t1.seconds+t2.seconds;
        int m=t1.minutes+t2.minutes;
        int h=t1.hours+t2.hours;
        this.seconds=s%60;
        this.minutes=(m+s/60)%60;
        this.hours=(h+m/60)%24;
    }

}




public class q3 {
    public static void main(String[] args) {
        Time t = new Time();
        Time t1 = new Time(3,55,52);
        Time t2 = new Time(4,10,10);
        Time t3 = new Time();
        t3.add(t1, t2);
        t3.display();
    
    }
}
