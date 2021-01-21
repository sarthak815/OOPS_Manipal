class Bike{
    int speedlimit = 100;
    void run(){
        System.out.println("The speedlimit is: "+speedlimit+"km/h");
    }
}

class Splendar extends Bike{
    int speedlimit= 120;
    void run(){
        System.out.println("The speedlimit is: "+speedlimit+"km/h");
    }
}



public class additional_2 {
    public static void main(String[] args) {
        Bike b = new Bike();
        Splendar s = new Splendar();
        b.run();
        s.run();
    }
}
