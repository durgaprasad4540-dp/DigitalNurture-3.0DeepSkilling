package BookCollection;

import java.util.*;

public class BookCollection {

    LinkedHashSet<String> books = new LinkedHashSet<>();

    public void addBook(String bookTitle)
    {
        books.add(bookTitle); 
    }

    public void removeBook(String bookTitle)
    {
        books.remove(bookTitle);
    }

    public void displayBooks()
    {
        Iterator<String> itr = books.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        
        BookCollection b = new BookCollection();
        
        b.addBook("Rich Dad Poor Dad");
        b.addBook("Rich Dad's Quadrant Flow");
        b.addBook("Invest in Real-Estate");
        b.addBook("Sales");
        b.addBook("Work ReWork");

        b.displayBooks();

        System.out.println();

        b.removeBook("Sales");

        b.displayBooks();

        




    }


    
}
