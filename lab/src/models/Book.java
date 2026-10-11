package models;

public class Book extends LibraryItem
{
    private String author;

    public String getAuthor() {return this.author; }
    public Book(int id, String title, int year, String author)
    {
        super(id, title,year);
        this.author = author;
    }

    @Override
    public void printInfo(){
        System.out.println(super.getId() + " " + super.getTitle() + " author: " + author +
                " year: " + super.getYear() + " availability: " + super.getAvailability());
    }
}
