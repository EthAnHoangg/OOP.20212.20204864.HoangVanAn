package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.utils.mediaUtils;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private ObservableList<Media> itemOrdered = FXCollections.observableArrayList();

    public ObservableList<Media> getItemOrdered() {
        return itemOrdered;
    }

    //    ---------------- add DVD ----------------
    public void addMedia(Media media) {
        if (itemOrdered.contains(media)) {
            System.out.println("Media has already added to the cart!");
        } else{
            itemOrdered.add(media);
        }
    }

    public void addMedia(Media... args) {
        for (Media arg : args) {
            addMedia(arg);
        }
    }

    //  --------------- remove DVD ----------------
    public void removeMedia(Media media) {
        itemOrdered.remove(media);
    }
    public void removeMedia(String title) {
        if (checkTitleValidation(title)) {
            for (Media media: itemOrdered) {
                if (media.getTitle().equalsIgnoreCase(title)) {
                    removeMedia(media);
                }
            }
        } else {
            System.out.println("Invalid title");
        }
    }
    public void removeMedia(int id) {
        if (checkIdValidation(id)) {
            for (Media media: itemOrdered) {
                if (media.getId() == id) {
                    removeMedia(media);
                }
            }
        } else {
            System.out.println("Invalid title");
        }
    }
//  ------------ check the validation -------------
    public boolean checkTitleValidation(String title) {
        int count = 0;
        for (Media media: itemOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                count += 1;
                break;
            }
        }
        return count != 0;
    }

    public boolean checkIdValidation(int id) {
        int count = 0;
        for (Media media: itemOrdered) {
            if (media.getId() == id) {
                count += 1;
                break;
            }
        }
        return count != 0;
    }

    //  --------------- searching function ----------------
    public void searchByTitle(String title) {
        int count = 0;
        for (Media media: itemOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No item found in the cart!");
        } else {
            System.out.println("---------------------------");
            System.out.println("Total found items: " + count);
        }
    }

    public void searchById(int id) {
        int count = 0;
        for (Media media: itemOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No item found in the cart!");
        } else {
            System.out.println("---------------------------");
            System.out.println("Total found items: " + count);
        }
    }

    public Media findMedia(String title){
        if (checkTitleValidation(title)){
            for (Media media: itemOrdered){
                if (media.getTitle().equalsIgnoreCase(title)){
                    return media;
                }
            }
        } else {
            System.out.println("----------------");
            System.out.println("|Invalid title!|");
            System.out.println("----------------");
        }
        return null;
    }

    //  -------------------- sorting funcitons --------------------
    public void sortByCost() {
        mediaUtils.sortByCost(itemOrdered);
    }

    public void sortByCost(boolean desc) {
        if (desc) {
            mediaUtils.sortByCost(itemOrdered, true);
        } else {
            mediaUtils.sortByCost(itemOrdered);
        }
    }

    public void sortByTitle() {
        mediaUtils.sortByTitle(itemOrdered);
    }

    public void sortByTitle(boolean desc) {
        if (desc) {
            mediaUtils.sortByTitle(itemOrdered, true);
        } else {
            mediaUtils.sortByTitle(itemOrdered);
        }
    }

//  ----------- other functions -----------
    public float totalCost() {
        float sum = 0;
        for (Media media: itemOrdered) {
            sum += media.getCost();
        }
        return sum;
    }

    public void print() {
        System.out.println("********************** CART ***********************");
        for (int i = 0; i < itemOrdered.size(); i++) {
            System.out.print((i + 1) + " ");
            System.out.println(itemOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
//  ----------- For lucky item -----------
    public Media getrALuckyItem(){
        double rand = Math.random();
        int index = (int)Math.floor(rand * itemOrdered.size());
        return itemOrdered.get(index);
    }

    public float totalCost(Media luckyMedia) {
        float sum = 0;
        for (Media media : itemOrdered) {
            sum += media.getCost();
        }
        return sum - luckyMedia.getCost();
    }

    public void printWithLuckyItem() {
        System.out.println("********************** CART ***********************");
        for (int i = 0; i < itemOrdered.size(); i++) {
            System.out.print((i + 1) + " ");
            System.out.println(itemOrdered.get(i).toString());
        }
        Media luckyMedia = getrALuckyItem();
        System.out.println("You got a lucky media");
        System.out.println(luckyMedia.toString());
        System.out.println("Total cost: " + totalCost(luckyMedia));
        System.out.println("***************************************************");
    }
}
