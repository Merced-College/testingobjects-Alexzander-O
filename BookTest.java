public class BookTest {
    public static void main(String[] args) { 
        
        // Create a Book with no constructors defined.
        Book book1 = new Book();

        // Print the object.
        System.out.println("Printing book1 directly:");
        System.out.println(book1);


        Book d1 = new Book();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("author = " + d1.getAuthor());   // expected: null
        System.out.println("series = " + d1.getSeries());     // expected: null
        System.out.println("title = " + d1.getTitle()); // expected: null
        

        // uses default constructor values
        Book d2 = new Book(); 
        System.out.println("\nd2 after default constructor:");
        System.out.println("author = " + d2.getAuthor() + ", series = " + d2.getSeries() + ", title = " + d2.getTitle());

        // uses parameterized constructor
        Book d3 = new Book("Brandon Sanderson", "Stormlight Archives", "Way of Kings"); 
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("author = " + d3.getAuthor() + ", series = " + d3.getSeries() + ", title = " + d3.getTitle());

    
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);


        System.out.println("\nMutating via setters after making fields private:");
        d3.setSeries("Stormlight Archives");
        d3.setAuthor("Brandon Sanderson");
        d3.setTitle("Way of Kings");
        System.out.println("d3 series via getter = " + d3.getSeries());
        System.out.println("d3 now = " + d3);

    }
}