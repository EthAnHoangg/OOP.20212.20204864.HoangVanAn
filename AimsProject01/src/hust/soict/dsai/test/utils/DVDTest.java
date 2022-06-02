package hust.soict.dsai.test.utils;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.utils.DVDUtils;

import java.util.Arrays;

public class DVDTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB", "bbbb", "bbbb", 2, 5.3f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC", "cccc", "cccc", 3, 5f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD", "dddd", "dddd", 4, 7.1f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 5.3f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 6f);
        DigitalVideoDisc[] dvdList = new DigitalVideoDisc[]{dvd1, dvd2, dvd3, dvd4, dvd5, dvd6};
        System.out.println(dvd1.getId());
        System.out.println(dvd2.getId());
        System.out.println(dvd3.getId());
        System.out.println(dvd4.getId());
        System.out.println(dvd5.getId());
        DVDUtils.sortByCost(dvdList);


        DigitalVideoDisc[] sorted = DVDUtils.sortByCost (dvdList, true);
        System.out.println("sort by cost: ");
        for (int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i].toString());
        }

        sorted = DVDUtils.sortByTitle (new DigitalVideoDisc[] {dvd4, dvd2, dvd5, dvd3, dvd1, dvd6}, true);
        System.out.println("sort by title: ");
        for (int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i].toString());
        }
    }
}
