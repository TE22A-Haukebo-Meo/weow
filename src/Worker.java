import java.util.Random;

public class Worker {
    Random rand = new Random();
    
    private String name;
    private int age;
    private int wage;

    public Worker(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Worker(){}

    void Setwage(){
        wage = rand.nextInt(10000,30000);
    }

    String GetName(){
        return name;
    }

    int GetAge(){
        return age;
    }

    int GetWage(){
        return wage;
    }


}
