package hust.soict.dsai.aims;

import hust.soict.dsai.aims.Store.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
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

    public static void filteringOption() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filtering by Id");
        System.out.println("2. Filtering by Title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void sortingOption() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by title");
        System.out.println("2. Sort by cost");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void removingOption() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Remove by title");
        System.out.println("2. Remove by id");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void SeeCurCart(Cart aCart) {
        Scanner sc = new Scanner(System.in);
        aCart.toString();
        boolean stopSeeingCart = false;
        while (!stopSeeingCart) {
            cartMenu();
            int seeCartOption = sc.nextInt();
            sc.nextLine();
            switch (seeCartOption) {
                case 0 -> stopSeeingCart = true;
                case 1 -> {
                    boolean stopSeeingFilteringOption = false;
                    while (!stopSeeingFilteringOption) {
                        filteringOption();
                        int filterOption = sc.nextInt();
                        sc.nextLine();
                        switch (filterOption) {
                            case 0 -> stopSeeingFilteringOption = true;
                            case 1 -> {
                                System.out.println("Enter the id");
                                int id = sc.nextInt();
                                aCart.searchById(id);
                            }
                            case 2 -> {
                                System.out.println("Enter the title");
                                String title = sc.nextLine();
                                aCart.searchByTitle(title);
                            }
                        }
                    }
                }
                case 2 -> {
                    boolean stopSeeingSortingOption = false;
                    while (!stopSeeingSortingOption) {
                        sortingOption();
                        int sortOption = sc.nextInt();
                        sc.nextLine();
                        switch (sortOption) {
                            case 0 -> stopSeeingSortingOption = true;
                            case 1 -> aCart.sortByTitle();
                            case 2 -> aCart.sortByCost(true);
                        }
                    }
                }
                case 3 -> {
                    boolean stopSeeingRemovingOption = false;
                    while (!stopSeeingRemovingOption) {
                        removingOption();
                        int removeOption = sc.nextInt();
                        sc.nextLine();
                        switch (removeOption) {
                            case 0 -> stopSeeingRemovingOption = true;
                            case 1 -> {
                                aCart.print();
                                System.out.println("Enter the title of the DVD you want to remove");
                                String title = sc.nextLine();
                                aCart.removeMedia(title);
                            }
                            case 2 -> {
                                aCart.print();
                                System.out.println("Enter the id of the DVD you want to remove");
                                int id = sc.nextInt();
                                aCart.removeMedia(id);
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("An order is created!");
                    if  (aCart.getItemOrdered().size() >= 5){
                        aCart.printWithLuckyItem();
                    } else {
                        aCart.print();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        MemoryDaemon md = new MemoryDaemon();
        Thread md = new Thread();
        md.setDaemon(true);
        md.run();
        Store aStore = new Store();
//        Add some sample DVDs for testing function.
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animaton", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animaton", 18.99f);
        aStore.addMedia(dvd1, dvd2, dvd3);

        Cart aCart = new Cart();
        boolean stopApp = false;
        while (!stopApp) {
            showMenu();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 0 -> {
                    System.out.println("Exit from the system!");
                    stopApp = true;
                }
                case 1 -> {
                    boolean stopViewingStore = false;
                    while (!stopViewingStore) {
                        storeMenu();
                        int viewStoreOption = sc.nextInt();
                        sc.nextLine();
                        switch (viewStoreOption) {
                            case 0 -> stopViewingStore = true;
                            case 1 -> {
                                System.out.println("Enter the title of the DVD you want to see the detail ");
                                String title1 = sc.nextLine();
                                Media dvd_dt = aStore.findMedia(title1);
                                System.out.println(dvd_dt.toString());
                            }
                            case 2 -> {
                                aStore.print();
                                System.out.println("Enter the title of the DVD you want to add to cart");
                                String title2 = sc.nextLine();
                                Media dvd_atc = aStore.findMedia(title2);
                                aCart.addMedia(dvd_atc);
                                aCart.print();
                            }
                            case 3 -> SeeCurCart(aCart);
                        }
                    }
                }
                case 2 -> {
                    boolean stopUpdatingStore = false;
                    while (!stopUpdatingStore) {
                        updatingStoreOption();
                        int updateOption = sc.nextInt();
                        sc.nextLine();
                        switch (updateOption) {
                            case 0 -> stopUpdatingStore = true;
                            case 1 -> {
                                Media dvd = aStore.generatingNewMedia();
                                aStore.addMedia(dvd);
                            }
                            case 2 -> {
                                System.out.println("Enter the title of the DVD you want to remove");
                                String title = sc.nextLine();
//                                aStore.removeDVD(title);
                            }
                        }
                    }
                }
                case 3 -> SeeCurCart(aCart);
            }
        }
    }
}