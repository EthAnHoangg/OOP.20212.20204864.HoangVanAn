package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle",
                "National Geography",
                "Roger Allers",
                87,
                19.95f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella",
                "Cartoon",
                "Geogre Lucas",
                120,
                24.95f);
//        swap(jungleDVD, cinderellaDVD);
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
//        actual_swap(jungleDVD, cinderellaDVD);
//        System.out.println("Jungle DVD information " + "\n" +
//                "Title: " + jungleDVD.getTitle() + "\n" +
//                "Category: " + jungleDVD.getCategory() + "\n"+
//                "Length: " + jungleDVD.getLength());
//        System.out.println("Cindrella DVD information " + "\n" +
//                "Title: " + cinderellaDVD.getTitle() + "\n" +
//                "Category: " + cinderellaDVD.getCategory() + "\n"+
//                "Length: " + cinderellaDVD.getLength());

        System.out.println(jungleDVD.getId());
    }
    public static void swap (Object o1, Object o2 ){
        Object tmp = new Object();
        tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        dvd.setTitle(title);
    }
    public static void changeDirector (DigitalVideoDisc dvd, String director){
        dvd.setDirector(director);
    }
    public static void changeCategory (DigitalVideoDisc dvd, String category){
        dvd.setCategory(category);
    }
    public static void changeLength (DigitalVideoDisc dvd, int length){
        dvd.setLength(length);
    }
    public static void changeCost (DigitalVideoDisc dvd, float cost){
        dvd.setCost(cost);
    }
    public static void actual_swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
//      ===== save the information ======
        String tempTitle = dvd1.getTitle();
        String tempDirector = dvd1.getDirector();
        String tempCategory = dvd1.getCategory();
        int tempLength = dvd1.getLength();
        float tempCost = dvd1.getCost();
//      ===== change the first dvd ======
        changeTitle(dvd1, dvd2.getTitle());
        changeCategory(dvd1, dvd2.getCategory());
        changeDirector(dvd1, dvd2.getDirector());
        changeLength(dvd1, dvd2.getLength());
        changeCost(dvd1, dvd2.getCost());
//      ===== change the second dvd ======
        changeTitle(dvd2, tempTitle);
        changeCategory(dvd2, tempCategory);
        changeDirector(dvd2, tempDirector);
        changeLength(dvd2, tempLength);
        changeCost(dvd2, tempCost);
    }

}
