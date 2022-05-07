package Aims;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animaton", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geogre Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animaton", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd2);
//      result = 38.94
        System.out.print("Total cost after remove dvd2 is: ");
        System.out.println(anOrder.totalCost());

    }
}
