package hust.soict.dsai.aims.Store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.Scanner;

public class Store {
    private ArrayList<Media> itemInStore = new ArrayList<>();

    public ArrayList<Media> getItemInStore() {
        return itemInStore;
    }

    public Media generatingNewMedia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter DVD information!");
        System.out.println("----");
        System.out.println("Please enter the DVD's title:");
        String title = sc.nextLine();
        System.out.println("Please enter the DVD's category:");
        String category = sc.nextLine();
        System.out.println("Please enter the DVD's director:");
        String director = sc.nextLine();
        System.out.println("Please enter the DVD's length:");
        int length = sc.nextInt();
        System.out.println("Please enter the DVD's cost");
        float cost = sc.nextFloat();
        Media media = new DigitalVideoDisc(title, category, director, length, cost );
        System.out.println("Created DVD with the following information:");
        System.out.println(media.toString());
        System.out.println("------------------------------------");
        return media;
    }

    public void addMedia(Media media){
        itemInStore.add(media);
    }

    public void addMedia (Media... args){
        for (Media arg : args) {
            addMedia(arg);
        }
    }

    public boolean checkTitleValidation (String title){
        int count = 0;
        for (Media media: itemInStore){
            if (media.getTitle().equalsIgnoreCase(title)){
                count += 1;
                break;
            }
        }
        return count != 0;
    }

    public void removeMedia(Media media){
        itemInStore.remove(media);
    }

    public void removeMedia(String title){
        Media media = findMedia(title);
        itemInStore.remove(media);
    }

    public Media findMedia(String title){
        if (checkTitleValidation(title)){
            for (Media media: itemInStore){
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

    public void print(){
        System.out.println("********************** Store **********************");
        for (int i = 0; i < itemInStore.size(); i++){
            System.out.print((i+1) + " ");
            System.out.println(itemInStore.get(i).toString());
        }
        System.out.println("***************************************************");
    }
}
