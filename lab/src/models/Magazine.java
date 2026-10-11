package models;

public class Magazine extends LibraryItem
{
    private int number;

    public Magazine(int id, String title, int year, int number)
    {
        super(id, title,year);
        this.number = number;
    }

    @Override
    public void printInfo(){
        System.out.println(super.getId() + " " + super.getTitle() + " num: " + number +
                " year: " + super.getYear() + " availability: " + super.getAvailability());
    }
}
