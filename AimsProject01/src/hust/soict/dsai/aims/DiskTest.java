package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DiskTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animaton", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animaton", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
                "Animaton", "Roger Allers", 87, 17f);

        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.searchByTitle("aladdin");
        anOrder.searchByTitle("the lion king");
    }
}
