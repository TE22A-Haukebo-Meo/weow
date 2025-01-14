import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        Rock r1 = new Rock(111);

        System.out.println("Bongus how meny rok?");
        int bal = tb.nextInt();
        ArrayList<Rock> rockList = new ArrayList<>();

        for (int i = 0; i < bal; i++) {
            System.out.println("hur många weitings?");
            int vikt = tb.nextInt();
            Rock r = new Rock(vikt);
            rockList.add(r);
        }

        
        /*Book b1 = new Book("På en kudde av gräs", 350);
        Book b2 = new Book("Över näktergalens golv", 300);
        Book b3 = new Book("Vid hägerns skarpa skri", 400);

        b1.turnPage();
        System.out.println(b1.GetCurrentPage());
        System.out.println(b2.GetName());
        System.out.println(b3.GetPages());*/
    }
}
