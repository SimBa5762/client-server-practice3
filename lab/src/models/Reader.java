package models;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private int id;
    private String name;
    private String phone;

    private static int count = 0;

    public Reader(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
        id = count;
        count++;
    }

    public void printInfo()
    {
        System.out.println(id +") " + name + " phone: " + phone);
    }

    public int getId() {return id; }


}
