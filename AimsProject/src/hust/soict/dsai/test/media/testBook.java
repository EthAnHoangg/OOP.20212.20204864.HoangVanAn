package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;

import java.util.List;

import static java.util.Arrays.asList;

public class testBook {
    public static void main(String[] args) {
        Book book1 = new Book("AAAA", "Science Fiction",
                100, "ten em la hoang van an em an chao moi nguoi nha");
        System.out.println(book1.toString());
    }
}
