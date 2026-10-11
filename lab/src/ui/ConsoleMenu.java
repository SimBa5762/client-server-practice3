package ui;

import models.LibraryItem;
import services.LibraryService;

import java.util.Scanner;
import models.Reader;

public class ConsoleMenu {

    private final LibraryService libraryService;
    private final Scanner scanner;

    public ConsoleMenu(LibraryService ls)
    {
        libraryService = ls;
        scanner = new Scanner(System.in);
    }

    public void printMenu()
    {
        System.out.println(
                "\n\n\n========== БІБЛІОТЕКА ==========\n" +
                "1. Показати всі видання\n" +
                "2. Показати доступні видання\n" +
                "3. Знайти видання\n" +
                "4. Додати читача\n" +
                "5. Показати читачів\n" +
                "6. Взяти видання\n" +
                "7. Повернути видання\n" +
                "0. Вихід\n\n");
    }

    public static void clearByScroll() {
        // 100 пустых строк сдвинут предыдущий текст за пределы видимости
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public void start()
    {
        boolean running = true;
        printMenu();

        while(running)
        {

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                 case 1: {
                     libraryService.showAllItems();
                 } break;
                 case 2:{
                     libraryService.showAvailableItems();
                 } break;
                 case 3:
                 {
                     System.out.println("Введіть id примірника:");
                     int id = scanner.nextInt();
                     scanner.nextLine();
                     libraryService.findItemById(id).printInfo();
                 } break;
                 case 4:
                 {
                     System.out.println("Введіть своє ім'я:");
                     String name = scanner.nextLine();

                     System.out.println("Введіть свій номер телефону:");
                     String phone = scanner.nextLine();

                     Reader newReader = new Reader(name, phone);
                     libraryService.addReader(newReader);
                 } break;
                 case 5: {
                     libraryService.showAllReaders();
                 } break;
                 case 6: {
                     System.out.println("Введіть id примірника:");
                     int item_id = scanner.nextInt();

                     System.out.println("Введіть id читача:");
                     int reader_id = scanner.nextInt();

                     libraryService.borrowItem(item_id, reader_id);
                 } break;
                 case 7:
                 {
                     System.out.println("Введіть id примірника:");
                     int item_id = scanner.nextInt();

                     libraryService.returnItem(item_id);
                 } break;
                 case 0: running = false; break;

            }
        }

    }

}
