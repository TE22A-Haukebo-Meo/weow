import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);

        Worker w1 = new Worker("john", 41);
        WhiteCollar w2 = new WhiteCollar("sigma", 33);
        BlueCollar w3 = new BlueCollar("daquaviontavious", 19);

        w1.Setwage();
        w2.Setwage();
        w3.Setwage();

        System.out.println(w1.GetAge()+" "+w1.GetName()+" "+w1.GetWage());
        System.out.println(w2.GetName()+" "+w2.GetAge()+" "+w2.GetWage());
        System.out.println(w3.GetName()+" "+w3.GetAge()+" "+w3.GetWage());

        w3.Build();
        w3.Repair();
        w3.Destroy();
        w2.AttendMeeting();
        w2.DoSpreadsheets();
        w2.DrinkCoffee();
        
        
        /*Rock r1 = new Rock(111);

        System.out.println("Bongus how meny rok?");
        int bal = tb.nextInt();
        ArrayList<Rock> rockList = new ArrayList<>();

        for (int i = 0; i < bal; i++) {
            System.out.println("hur många weitings?");
            int vikt = tb.nextInt();
            Rock r = new Rock(vikt);
            rockList.add(r);
        }*/

        
        /*Book b1 = new Book("På en kudde av gräs", 350);
        Book b2 = new Book("Över näktergalens golv", 300);
        Book b3 = new Book("Vid hägerns skarpa skri", 400);

        b1.turnPage();
        System.out.println(b1.GetCurrentPage());
        System.out.println(b2.GetName());
        System.out.println(b3.GetPages());*/
    }
}
