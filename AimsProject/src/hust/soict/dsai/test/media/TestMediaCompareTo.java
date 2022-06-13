package hust.soict.dsai.test.media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class TestMediaCompareTo<dvd1> {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 18.99f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animaton", 18.99f);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
                "AnimationWibu", "Roger Allers", 87, 35f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Betaverse", "Science Fiction",
                "An", 80, 24.95f);

        ArrayList<Media> collection = new ArrayList<Media>();
        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);
        collection.add(dvd4);
        collection.add(dvd5);
        java.util.Iterator iterator = collection.iterator();
        System.out.println("-----------------------------");
        System.out.println("The DVDs currently in the orders are: ");
         while (iterator.hasNext()) {
             System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
         }

         java.util.Collections.sort(collection, Media.COMPARE_BY_COST_TITLE);

         iterator = collection.iterator();
         System.out.println("--------------------------------");
         System.out.println("The DVDs in sorted order are: ");

         while (iterator.hasNext()){

             System.out.println(((DigitalVideoDisc) iterator.next()).toString());
         }
         System.out.println("---------------------------------");
    }
}
