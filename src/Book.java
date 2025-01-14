public class Book {
    private String name;
    private int pages;
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

    String GetName(){
        return name;
    }

    int GetPages(){
        return pages;
    }
}
