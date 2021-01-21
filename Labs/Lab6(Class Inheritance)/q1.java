import java.util.Scanner;

class Account{
    int acc_no;
    String name,type;
    double balance=0;
    Scanner sc = new Scanner(System.in);
    Account(){
        System.out.println("Enter name of the customer: ");
        name = sc.nextLine();
        System.out.println("Enter account number: ");
        acc_no=sc.nextInt();
    }

    void deposit(int val){

        balance = balance+val;
    }
    void display(){
        System.out.println("The balance is: "+balance);
    }
    void withdraw(int val){
        if(balance<val){
            System.out.println("Insufficient funds!");
            return;
        }
        balance = balance - val;

    }

}

class Savings extends Account{
    Savings(){
        super();
        System.out.println("This is a savings account");
        type = "Savings";
        System.out.println("Enter amount to be deposited: ");
        deposit(sc.nextInt());
        Interest();
    }
    void Interest(){
        balance = balance+(0.06*balance);
    }
}

class Current extends Account{
    Current(){
        super();
        System.out.println("The ccount type selected is current, minimum account balance is Rs.1000");
        type = "Current";
        System.out.println("Eneter the amount to deposited: ");
        deposit(sc.nextInt());
        Service();

    }

    void Service(){
        if(balance<1000){
            balance=balance*0.9;
        }
    }
}


public class q1 {
    public static void main(String[] args) {
        Savings s1=new Savings();
        s1.withdraw(200);
        s1.Interest();
        s1.display();
        Current c1=new Current();
        c1.withdraw(9000);
        c1.Service();
        c1.display();       
    }
}
