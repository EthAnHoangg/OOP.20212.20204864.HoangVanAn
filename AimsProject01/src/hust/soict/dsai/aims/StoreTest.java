package hust.soict.dsai.aims;

import hust.soict.dsai.aims.Store.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store aStore = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animaton", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animaton", 18.99f);

        aStore.addDVD(dvd1, dvd2, dvd3);

        for (int i = 0; i < aStore.getItemInStore().length; i++){
            System.out.println(aStore.getItemInStore()[i]);
        }
//        DigitalVideoDisc dvd = aStore.generatingNewDVD();
//        aStore.addDVD(dvd);

        System.out.println(aStore.checkTitleValidation("the lion king"));
    }
}
