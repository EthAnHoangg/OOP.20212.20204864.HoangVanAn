package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class testBook {
    public static void main(String[] args) {
        Book book1 = new Book("AAAA", "Science Fiction",
                100, "ten em la hoang van an em an chao moi nguoi nha");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        List<Media> mediae = new ArrayList<>();

        mediae.add(book1);
        mediae.add(dvd1);
        for (Media m: mediae){
            System.out.println(m.toString());
        }
    }
}
