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
class EBooks extends Book{
    String format;
    public EBooks(String author,String title,String format){
        super(author,title);
        this.format = format;
    }

    public void displayBook(){
        System.out.println("\nAuthor is :"+author+"\nTitle is :"+title);
        System.out.println("Format :"+format);
    }
}
class AudioBooks extends Book{
    String duration;
    public AudioBooks(String author,String title,String duration){
        super(author,title);
        this.duration = duration;
    }

    public void displayBook(){
        System.out.println("\nAuthor is :"+author+"\nTitle is :"+title);
        System.out.println("Duration :"+duration);
    }
}
public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("auth01","book01");
        printedBooks book2 = new printedBooks("auth02", "book02", 23);
        EBooks book3 = new EBooks("auth03", "book03", "pdf");
        AudioBooks book4 = new AudioBooks("auth04", "book04", "1.23");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        book4.displayBook();
    }
}
