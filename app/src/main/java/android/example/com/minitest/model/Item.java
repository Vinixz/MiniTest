package android.example.com.minitest.model;

import java.util.List;

/**
 * Created by Vinixz on 10/9/2018.
 */

public class Item {

    public static List<Item> items;

    public String title;
    public String date;
    public int imagePath;

    public Item(String title, String date, int imagePath) {
        this.title = title;
        this.date = date;
        this.imagePath = imagePath;
    }
}
