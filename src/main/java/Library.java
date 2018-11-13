import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<Book>();


    }


    public int capacityCount()
    { return this.capacity;}

    public int stockCount()
    {return this.books.size();}



    public String getname() {
        return name;

    }

    public int hasBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
    if(capacityCount() > stockCount()){
        this.books.add(book);
    }


    }
}
