package hust.soict.dsai.aims.utils;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DVDUtils {

/* Comparing functions always return the dvd that has greater value.
   If 2 dvds have the same value, return the first dvd */
    public static DigitalVideoDisc compareByCost (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (dvd1.getCost() > dvd2.getCost()) {
            return dvd1;
        } else if (dvd1.getCost() < dvd2.getCost()){
            return dvd2;
        } else {
            return dvd1;
        }
    }

    public static DigitalVideoDisc compareByTitle (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        int diff = dvd1.getTitle().compareToIgnoreCase(dvd2.getTitle());
        if (diff < 0){
            return dvd2;
        } else if (diff > 0){
            return dvd1;
        } else {
            return dvd1;
        }
    }

/*  Sorting function all sorting in ascending order by default,
    but if desc is true then it sort in descending order
    ------------------------------------------------------------
    In case they have the same title (or cost) the DVDs having the higher cost (or in alphabetical order) will be display first.*/
    public static DigitalVideoDisc[] sortByCost (DigitalVideoDisc[] dvdList){
        for (int i = 0; i < dvdList.length - 1; i++){
            for (int j = i + 1; j < dvdList.length; j++){
                if (dvdList[j].getCost() < dvdList[i].getCost()){
                    DigitalVideoDisc temp = dvdList[j];
                    dvdList[j] = dvdList[i];
                    dvdList[i] = temp;
                } else if  (dvdList[j].getCost() == dvdList[i].getCost()){
                    if (compareByTitle(dvdList[j], dvdList[i]).getTitle().equalsIgnoreCase(dvdList[j].getTitle())){
                        DigitalVideoDisc temp = dvdList[j];
                        dvdList[j] = dvdList[i];
                        dvdList[i] = temp;
                    }
                }
            }
        }
        return dvdList;
    }

    public static DigitalVideoDisc[] sortByCost (DigitalVideoDisc[] dvdList, boolean desc) {
        for (int i = 0; i < dvdList.length - 1; i++) {
            for (int j = i + 1; j < dvdList.length; j++) {
                if (dvdList[j].getCost() > dvdList[i].getCost()) {
                    DigitalVideoDisc temp = dvdList[j];
                    dvdList[j] = dvdList[i];
                    dvdList[i] = temp;
                } else if (dvdList[j].getCost() == dvdList[i].getCost()) {
                    if (compareByTitle(dvdList[j], dvdList[i]).getTitle().equalsIgnoreCase(dvdList[i].getTitle())) {
                        DigitalVideoDisc temp = dvdList[j];
                        dvdList[j] = dvdList[i];
                        dvdList[i] = temp;
                    }
                }
            }
        }
        return dvdList;
    }

    public static DigitalVideoDisc[] sortByTitle (DigitalVideoDisc[] dvdList){
        for (int i = 0; i < dvdList.length - 1; i++) {
            for (int j = i+1; j < dvdList.length; j++) {
                if (dvdList[j].getTitle().compareToIgnoreCase(dvdList[i].getTitle()) < 0){
                    DigitalVideoDisc temp = dvdList[j];
                    dvdList[j] = dvdList[i];
                    dvdList[i] = temp;
                } else if (dvdList[j].getTitle().compareToIgnoreCase(dvdList[i].getTitle()) == 0) {
                    if (compareByCost(dvdList[j], dvdList[i]).getCost() > dvdList[i].getCost()){
                        DigitalVideoDisc temp = dvdList[j];
                        dvdList[j] = dvdList[i];
                        dvdList[i] = temp;
                    }
                }
            }
        }
        return dvdList;
    }

    public static DigitalVideoDisc[] sortByTitle (DigitalVideoDisc[] dvdList, boolean desc){
        for (int i = 0; i < dvdList.length - 1; i++) {
            for (int j = i+1; j < dvdList.length; j++) {
                if (dvdList[j].getTitle().compareToIgnoreCase(dvdList[i].getTitle()) > 0){
                    DigitalVideoDisc temp = dvdList[j];
                    dvdList[j] = dvdList[i];
                    dvdList[i] = temp;
                } else if (dvdList[j].getTitle().compareToIgnoreCase(dvdList[i].getTitle()) == 0) {
                    if (compareByCost(dvdList[j], dvdList[i]).getCost() > dvdList[i].getCost()){
                        DigitalVideoDisc temp = dvdList[j];
                        dvdList[j] = dvdList[i];
                        dvdList[i] = temp;
                    }
                }
            }
        }
        return dvdList;
    }
}
