package hust.soict.dsai.aims;

import hust.soict.dsai.aims.Store.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.Scanner;

public class Aims {

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter DVDs in cart");
        System.out.println("2. Sort DVDs in cart");
        System.out.println("3. Remove DVD from cart");
        System.out.println("4. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a DVD’s details");
        System.out.println("2. Add a DVD to cart");
        System.out.println("3. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void updatingStoreOption() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a DVD to store");
        System.out.println("2. Remove a DVD from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void filteringOption(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filtering by Id");
        System.out.println("2. Filtering by Title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

    }


    public static void main(String[] args) {
        Store aStore = new Store();
//        Add some sample DVDs for testing function.
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animaton", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animaton", 18.99f);
        aStore.addDVD(dvd1, dvd2, dvd3);

        Cart aCart = new Cart();
        boolean stopApp = false;
        while (!stopApp) {
            showMenu();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exit from the system!");
                    stopApp = true;
                    break;
                case 1:
                    boolean stopViewingStore = false;
                    while(!stopViewingStore){
                        storeMenu();
                        int viewStoreOption = sc.nextInt();
                        sc.nextLine();
                        switch (viewStoreOption){
                            case 0:
                                stopViewingStore = true;
                                break;
                            case 1:
                                System.out.println("Enter the title of the DVD you want to see the detail ");
                                String title1 =  sc.nextLine();
                                DigitalVideoDisc dvd_dt = aStore.findDVD(title1);
                                System.out.println(dvd_dt.toString());
                                break;
                            case 2:
                                aStore.print();
                                System.out.println("Enter the title of the DVD you want to add to cart");
                                String title2 = sc.nextLine();
                                DigitalVideoDisc dvd_atc = aStore.findDVD(title2);
                                aCart.addDigitalVideoDisc(dvd_atc);
                                aCart.print();
                            case 3:
                                aCart.print();
                        }
                    }
                    break;
                case 2:
                    boolean stopUpdatingStore = false;
                    while (!stopUpdatingStore) {
                        updatingStoreOption();
                        int updateOption = sc.nextInt();
                        sc.nextLine();
                        switch (updateOption) {
                            case 0:
                                stopUpdatingStore = true;
                                break;
                            case 1:
                                DigitalVideoDisc dvd = aStore.generatingNewDVD();
                                aStore.addDVD(dvd);
                                break;
                            case 2:
                                System.out.println("Enter the title of the DVD you want to remove");
                                String title = sc.nextLine();
                                aStore.removeDVD(title);
                                break;
                        }
                    }
                case 3:
                    boolean stopSeeingCart = false;
                    while (!stopSeeingCart){
                        storeMenu();
                        int seeCartOption = sc.nextInt();
                        sc.nextLine();
                        switch (seeCartOption){
                            case 0:
                                stopSeeingCart = true;
                                break;
                            case 1:

                        }
                    }
            }
        }
    }
}
