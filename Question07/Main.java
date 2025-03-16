package Question07;

class Book{
    String author;
    String title;

    public Book(String author,String title){
        this.author = author;
        this.title = title;
    }

    public void displayBook(){
        System.out.println("Author is :"+author+"\nTitle is :"+title);
    }
}
class printedBooks extends Book{
    int pages;
    public printedBooks(String author,String title,int pages){
        super(author,title);
        this.pages = pages;
    }

    public void displayBook(){
        System.out.println("\nAuthor is :"+author+"\nTitle is :"+title);
        System.out.println("Pages :"+pages);
    }
}

public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("pakaya","paka book");
        printedBooks book2 = new printedBooks("paka2", "paka2", 23);

        book1.displayBook();
        book2.displayBook();
    }
}
