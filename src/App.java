import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        
        Book b1 = new Book("På en kudde av gräs", 350);
        Book b2 = new Book("Över näktergalens golv", 300);
        Book b3 = new Book("Vid hägerns skarpa skri", 400);

        b1.turnPage();
        System.out.println(b1.GetCurrentPage());
        System.out.println(b2.GetName());
        System.out.println(b3.GetPages());
    }
}
