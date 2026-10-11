import models.Magazine;
import services.LibraryService;
import ui.ConsoleMenu;
import models.Reader;
import models.Book;
import models.Magazine;
public class Main {

    public static void main(String[] args)
    {

        LibraryService libraryService = new LibraryService();
        ConsoleMenu menu = new ConsoleMenu(libraryService);

        libraryService.addItem(new Book(1,"1984", 1949, "Дж. Орвелл"));
        libraryService.addItem(new Magazine(24
                ,"BBC", 1945, 100));
        libraryService.addReader(new Reader("Іван", "0955348186"));

        menu.start();
    }
}
