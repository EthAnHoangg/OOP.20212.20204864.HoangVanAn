package hust.soict.dsai.aims.utils;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DVDUtils {
    public static String compareByCost (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (dvd1.getCost() > dvd2.getCost()) {
            return "The first DVD has greater cost than the second DVD.";
        } else if (dvd1.getCost() < dvd2.getCost()){
            return "The second DVD has greater cost than the first DVD.";
        } else {
            return "Two DVDs have the same cost.";
        }
    }

    public static String compareByTitle (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        int diff = dvd1.getTitle().compareToIgnoreCase(dvd2.getTitle());
        if (diff < 0){
            return "The title of the first DVD is smaller than the second one.";
        } else if (diff > 0){
            return "The title of the second DVD is smaller than the first one.";
        } else {
            return "Two DVDs have the same title.";
        }
    }

    public static DigitalVideoDisc[] sortByCost (DigitalVideoDisc[] dvdList){
        for (int i = 0; i < dvdList.length - 1; i++){
            for (int j = i; j < dvdList.length; j++){
                if (dvdList[j].getCost() < dvdList[i].getCost()){
                    DigitalVideoDisc temp = dvdList[j];
                    dvdList[j] = dvdList[i];
                    dvdList[i] = temp;
                }
            }
        }
        return dvdList;
    }

    public static DigitalVideoDisc[] sortByTitle (DigitalVideoDisc[] dvdList){
        for (int i = 0; i < dvdList.length - 1; i++) {
            for (int j = i; j < dvdList.length; j++) {
                if (dvdList[j].getTitle().compareToIgnoreCase(dvdList[i].getTitle()) < 0){
                    DigitalVideoDisc temp = dvdList[j];
                    dvdList[j] = dvdList[i];
                    dvdList[i] = temp;
                }
            }
        }
        return dvdList;
    }
}
