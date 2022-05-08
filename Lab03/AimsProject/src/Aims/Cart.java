package Aims;

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

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc[] newOrder = new DigitalVideoDisc[qtyOrdered + 1];
        for (int i = 0; i < qtyOrdered; i++) {
            newOrder[i] = itemOrdered[i];
        }
        newOrder[qtyOrdered] = disc;
        itemOrdered = newOrder;
        qtyOrdered++;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... args) {
        for (int i = 0; i < args.length; i++) {
            addDigitalVideoDisc(args[i]);
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc[] newOrder = new DigitalVideoDisc[qtyOrdered - 1];
        int index = 0;
        for (int i = 0; i < qtyOrdered - 1; i++) {
            if (disc.equals(itemOrdered[i])) {
                index = i;
                System.out.println("index found = " + index);
                for (int k = index; k < qtyOrdered - 1; k++) {
                    newOrder[k] = itemOrdered[k + 1];
                }
                break;
            } else {
                newOrder[i] = itemOrdered[i];
            }
        }
        itemOrdered = newOrder;
        qtyOrdered--;
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemOrdered[i].getCost();
        }
        return sum;
    }
}
