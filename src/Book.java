public class Book {
    String name;
    int pages;
    private int currentPage;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    void turnPage(){
        currentPage += 1;
    }

    int GetCurrentPage(){
        return currentPage;
    }
}
