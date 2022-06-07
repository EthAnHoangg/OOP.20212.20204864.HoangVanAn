package hust.soict.dsai.test.utils;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.utils.mediaUtils;
import hust.soict.dsai.aims.utils.mediaUtils;

import java.util.ArrayList;

public class DVDTest {
    public static void main(String[] args) {
        Media dvd1 = new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
        Media dvd2 = new DigitalVideoDisc("BBBB", "bbbb", "bbbb", 2, 5.3f);
        Media dvd3 = new DigitalVideoDisc("CCCC", "cccc", "cccc", 3, 5f);
        Media dvd4 = new DigitalVideoDisc("DDDD", "dddd", "dddd", 4, 7.1f);
        Media dvd5 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 5.3f);
        Media dvd6 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 6f);
        ArrayList<Media> dvdList = new ArrayList<Media>(){
            {
                add(dvd1);
                add(dvd2);
                add(dvd3);
                add(dvd4);
                add(dvd5);
                add(dvd6);
            }
        };
        System.out.println(dvd1.getId());
        System.out.println(dvd2.getId());
        System.out.println(dvd3.getId());
        System.out.println(dvd4.getId());
        System.out.println(dvd5.getId());
        mediaUtils.sortByCost(dvdList);

        ArrayList<Media> sorted = mediaUtils.sortByCost (dvdList, true);
        System.out.println("sort by cost: ");
        for (int i = 0; i < sorted.size(); i++){
            System.out.println(sorted.get(i).toString());
        }

        sorted = mediaUtils.sortByTitle (dvdList, true);
        System.out.println("sort by title: ");
        for (int i = 0; i < sorted.size(); i++){
            System.out.println(sorted.get(i).toString());
        }
    }
}
