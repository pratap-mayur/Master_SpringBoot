import java.util.*;

class Book{
    private String title;
    private String author;
    private  int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author){
            this.author = author;
        }
        public String getAuthor(){
            return author;
        }
        public Book(String title,String author,int price){

        this.title = title;
        this.author = author;
        this.price = price;
        }
        public void displayDetails(){

            System.out.println("Title: " + getTitle());
            System.out.println("Author: " + getAuthor());
            System.out.println("Price: " + getPrice());
    }
}
public class create_a_book_class {
    public static void main(String[] args) {
        Book book = new Book("Mohan", "Sohan", 250);
        book.displayDetails();
        //System.out.println(book.title);
        //book.title = "ridhima";
        //System.out.println(book.title);
//        book.author ="mandani";
        book.setAuthor("mandani");
        System.out.println(book.getAuthor());
    }
}