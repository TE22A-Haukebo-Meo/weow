public class Book {
    String name;
    int pages;
    public int currentPage;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    void turnPage(){
        currentPage += 1;
    }
}
