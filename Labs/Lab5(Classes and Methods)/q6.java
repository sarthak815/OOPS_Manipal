import java.io.FileWriter;


class Book{
    String title, author, edition;

    Book(String t, String a, String e){
        title=t;
        author=a;
        edition=e;
    }

    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(edition);
    }
}





public class q6 {
    public static void main(String[] args) {
        Book[] arr = new Book[6];
        arr[0] = new Book("A", "Harry", "12");
        arr[1] = new Book("B", "Mary", "13");
        arr[2] = new Book("A", "Harry", "12");
        arr[3] = new Book("B", "Mary", "13");
        arr[4] = new Book("A", "Harry", "12");
        arr[5] = new Book("B", "Mary", "13");
        int n = 6;
        for(int i=0;i<n;i++){
            if(arr[i].author=="Harry"){
                System.out.println(arr[i].title);
            }
        }
    }
}
