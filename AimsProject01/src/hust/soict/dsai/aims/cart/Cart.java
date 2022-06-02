package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.utils.DVDUtils;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;

    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    private int qtyOrdered = 0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public DigitalVideoDisc[] getItemOrdered() {
        return itemOrdered;
    }

//    ---------------- add DVD ----------------
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            DigitalVideoDisc[] newOrder = new DigitalVideoDisc[qtyOrdered + 1];
            for (int i = 0; i < qtyOrdered; i++) {
                newOrder[i] = itemOrdered[i];
            }
            newOrder[qtyOrdered] = disc;
            itemOrdered = newOrder;
            qtyOrdered++;
        } else {
            System.out.println("Your cart is full, can't buy more DVD");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... args) {
        for (int i = 0; i < args.length; i++) {
            addDigitalVideoDisc(args[i]);
        }
    }
//  --------------- remove DVD ----------------
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > 0) {
            DigitalVideoDisc[] newOrder = new DigitalVideoDisc[qtyOrdered - 1];
            for (int i = 0; i < qtyOrdered; i++) {
                if (disc.equals(itemOrdered[i])) {
                    for (int k = i; k < qtyOrdered - 1; k++) {
                        newOrder[k] = itemOrdered[k + 1];
                    }
                    break;
                } else {
                    newOrder[i] = itemOrdered[i];
                }
            }
            itemOrdered = newOrder;
            qtyOrdered--;
        } else {
            System.out.println("Nothing in your cart yet!");
        }
    }

    public void removeDigitalVideoDisc(String title){
        if (checkTitleValidation(title)){
            for  (int i = 0; i < qtyOrdered; i++){
                if (itemOrdered[i].getTitle().equalsIgnoreCase(title)){
                    removeDigitalVideoDisc(itemOrdered[i]);
                }
            }
        } else {
            System.out.println("Invalid title");
        }
    }

    public void removeDigitalVideoDisc(int id){
        if (checkIdValidation(id)){
            for  (int i = 0; i < qtyOrdered; i++){
                if (itemOrdered[i].getId() == id){
                    removeDigitalVideoDisc(itemOrdered[i]);
                }
            }
        } else {
            System.out.println("Invalid id!");
        }
    }

    public boolean checkTitleValidation (String title){
        int count = 0;
        for (int i = 0; i < itemOrdered.length; i++){
            if (itemOrdered[i].getTitle().equalsIgnoreCase(title)){
                count += 1;
                break;
            }
        }
        return count != 0;
    }

    public boolean checkIdValidation (int id){
        int count = 0;
        for (int i = 0; i < itemOrdered.length; i++){
            if (itemOrdered[i].getId() == id){
                count += 1;
                break;
            }
        }
        return count != 0;
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemOrdered[i].getCost();
        }
        return sum;
    }
    //  --------------- searching function ----------------
    public void searchByTitle(String title){
        int count = 0;
        for (int i = 0; i < itemOrdered.length; i++){
            if (itemOrdered[i].getTitle().equalsIgnoreCase(title)){
                System.out.println(itemOrdered[i].toString());
                count ++;
            }
        }
        if (count == 0){
            System.out.println("No item found in the cart!");
        } else {
            System.out.println("---------------------------");
            System.out.println("Total found items: " + count);
        }
    }

    public void searchById(int id){
        int count  = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemOrdered[i].getId() == id){
                System.out.println(itemOrdered[i].toString());
                count ++;
            }
        }
        if (count == 0){
            System.out.println("No item found in the cart!");
        } else {
            System.out.println("---------------------------");
            System.out.println("Total found items: " + count);
        }
    }

//  -------------------- sorting funcitons --------------------
    public void sortByCost(){
        DVDUtils.sortByCost(itemOrdered);
    }

    public void sortByCost(boolean desc){
        if (desc){
            DVDUtils.sortByCost(itemOrdered, true);
        } else {
            DVDUtils.sortByCost(itemOrdered);
        }
    }

    public void sortByTitle(){
        DVDUtils.sortByCost(itemOrdered);
    }

    public void sortByTitle(boolean desc){
        if (desc) {
            DVDUtils.sortByTitle(itemOrdered, true);
        } else {
            DVDUtils.sortByTitle(itemOrdered);
        }
    }

    public void print(){
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.print((i+1) + " ");
            System.out.println(itemOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
