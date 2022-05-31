package hust.soict.dsai.aims.Store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.Scanner;

public class Store {
    private DigitalVideoDisc[] itemInStore = new DigitalVideoDisc[0];

    public DigitalVideoDisc[] getItemInStore() {
        return itemInStore;
    }

    public DigitalVideoDisc generatingNewDVD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter DVD information!");
//        System.out.println("Please enter the id");
//        int id = sc.nextInt();
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

        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost );
        System.out.println("Created DVD with the following information:");
        System.out.println(dvd.toString());
        System.out.println("------------------------------------");
        return dvd;
    }

    public void addDVD(DigitalVideoDisc dvd){
        int size = itemInStore.length;
        DigitalVideoDisc[] temp_itemInStore = new DigitalVideoDisc[size + 1];
        System.arraycopy(itemInStore, 0, temp_itemInStore, 0, size);
        temp_itemInStore[size] = dvd;
        itemInStore = temp_itemInStore;
    }

    public void addDVD (DigitalVideoDisc... args){
        for (int i = 0; i < args.length; i++) {
            addDVD(args[i]);
        }
    }

    public boolean checkTitleValidation (String title){
        int count = 0;
        for (int i = 0; i < itemInStore.length; i++){
            if (itemInStore[i].getTitle().equalsIgnoreCase(title)){
                count += 1;
                break;
            }
        }
        return count != 0;
    }

    public void removeDVD(String title){
        if (checkTitleValidation(title)) {
            int size = itemInStore.length;
            DigitalVideoDisc[] temp_itemInStore = new DigitalVideoDisc[size - 1];
            for (int i = 0; i < size; i++) {
                if (itemInStore[i].getTitle().equalsIgnoreCase(title)) {
                    for (int k = i; k < size - 1; k++) {
                        temp_itemInStore[k] = itemInStore[k + 1];
                    }
                    break;
                } else {
                    temp_itemInStore[i] = itemInStore[i];
                }
            }
            itemInStore = temp_itemInStore;
        } else {
            System.out.println("Invalid title!");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd){
        int size = itemInStore.length;
        for (int i = 0; i < size; i++){
            if (itemInStore[i].getTitle().equalsIgnoreCase(dvd.getTitle())){
                removeDVD(dvd.getTitle());
            }
        }
    }

    public DigitalVideoDisc findDVD (String title){
        if (checkTitleValidation(title)){
            for (int i = 0; i < itemInStore.length; i++){
                if (itemInStore[i].getTitle().equalsIgnoreCase(title)){
                    return itemInStore[i];
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
        for (int i = 0; i < itemInStore.length; i++){
            System.out.print((i+1) + " ");
            System.out.println(itemInStore[i].toString());
        }
        System.out.println("***************************************************");
    }
}
