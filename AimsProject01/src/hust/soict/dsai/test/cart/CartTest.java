package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart Cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animaton", "Roger Allers", 87, 19.95f);
        Cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);
        Cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animaton", 18.99f);
        Cart.addDigitalVideoDisc(dvd3);
        Cart.print();
        Cart.searchByTitle("Star Wars");
        Cart.removeDigitalVideoDisc(dvd2);
        Cart.print();
    }
}
