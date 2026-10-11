package models;

public class LibraryItem {
    private final int id;
    private String title;
    private int year;
    private boolean available;
    private Reader reader;

    public void setReader(Reader reader) { this.reader = reader; }
    public void setAvailability(boolean availability) { this.available = availability; }

    public String getTitle() { return title; }
    public int getId() { return id; }
    public int getYear() { return year; }
    public boolean getAvailability() { return available; }
    public Reader getReader(){ return reader; }

    LibraryItem(int id, String title, int year)
    {
        this.id = id;
        this.title = title;
        this.year = year;
        this.available = true;
    }
    public void borrow()
    {
        if(!available)
        {
            available = false;
        }
        else{
            available = false;
        }
    }

    public void returnItem()
    {
        if(!available)
        {
            available = true;
        }
        else{
            available = true;
        }
    }

    public void printInfo()
    {
        System.out.println(id + " " + title + " " + year + " availability: " + available);
    };

}
