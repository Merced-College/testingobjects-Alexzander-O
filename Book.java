//Alexzander Oates 1/29/26
//data variables author, series, title


public class Book {
    //data variables
    private String author;
    private String series;
    private String title;


    public Book() {            
    //default constructors
    author = "Unknown";
    series = "Unkown";
    title = "Unknown";
    }


    public Book(String author, String series, String title) { 
    //parameterized constructor
    this.author = author;
    this.series = series;
    this.title = title;
    }

    
    @Override
    public String toString() {
        return "Book{author = '" + author + "', series = '" + series + "', title = '" + title + "'}";
    }


    public String getAuthor() { 
        return author; 
    }
    public void setAuthor(String author) { 
        this.author = author; 
    }

    public String getSeries() { 
        return series; 
    }
    public void setAge(String series) { 
        this.series = series; 
    }

    public String getTitle() { 
        return title; 
    }
    public void setTitle(String title) { 
        this.title = title; 
    }

    //I don't really know what this is for but the code breaks without it.
    public void setSeries(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'setSeries'");
    }
}
