class Game{
    void type1(){
        System.out.println("The game is indoor or outdoor");
        return;
    }
}
class chess extends Game{
    void type1(){
        System.out.println("Chess is an indoor game");
        return;
    }
}

class Cricket extends Game{
    void type1(){
        System.out.println("Cricket is an outdoor game");
        return;
    }
}





public class additional_1 {
    public static void main(String[] args) {
        chess c = new chess();
        Cricket cr = new Cricket();
        c.type1();
        cr.type1();
    }
}
