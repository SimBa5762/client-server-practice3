package services;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public List<LibraryItem> itemList = new ArrayList<LibraryItem>();
    public List<Reader> readerList = new ArrayList<Reader>();

    public void addItem(LibraryItem item)
    {
        itemList.add(item);
    }

    public void addReader(Reader reader)
    {
        readerList.add(reader);
    }

    public void showAllItems()
    {
        itemList.forEach(item -> {
            item.printInfo();
        });
    }

    public void showAllReaders()
    {
        readerList.forEach(reader -> {
            reader.printInfo();
        });
    }
    public void showAvailableItems()
    {
        System.out.println("Available items: ");
        itemList.forEach(item -> {
            if(item.getAvailability()) item.printInfo();
        });
    }

    public LibraryItem findItemById(int id) {
        LibraryItem finded = null; // Обов'язкова ініціалізація
        for (LibraryItem item : itemList) {
            if (item.getId() == id) {
                finded = item;
                break;
            }
        }
        return finded;
    }

    public Reader findReaderById(int id)
    {
        Reader finded = null; // Обов'язкова ініціалізація
        for (Reader r : readerList) {
            if (r.getId() == id) {
                finded = r;
                break;
            }
        }

        return finded;
    }
    public void borrowItem(int itemId, int readerId)
    {
        Reader reader = findReaderById(readerId);
        LibraryItem item = findItemById(itemId);

        if (item != null && reader != null) {
            // Змінюємо стан об'єкта через локальну змінну:
            item.setAvailability(false);
            item.setReader(reader);
        }
    }
    public void returnItem(int itemId)
    {
        LibraryItem item = findItemById(itemId);
        if (item != null) {
            // Змінюємо стан об'єкта через локальну змінну:
            item.setAvailability(true);
            item.setReader(null);
        }
    }
}
