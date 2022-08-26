package hust.soict.dsai.aims.media;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class Media implements Comparable<Media> {

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia;
    private LocalDate dateAdded;

//  ============= Constructor =============
    public Media(){}

    public Media(String title, String category,  float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbMedia ++;
        this.id = nbMedia;
    }

//  ============ Getter ============
    public int getId() {return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public static int getNbMedia() {
        return nbMedia;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

//  ============= Setter =============
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public abstract String toString();

    public boolean equals (Object o){
        if (o instanceof  Media){
            return getId() == ((Media) o).getId();
        }
        return false;
    }

    public int compareTo(Media other){
        if (getTitle().equalsIgnoreCase(other.getTitle())){
            return getCategory().compareTo(other.getCategory());
        }
        return getTitle().compareTo(other.getTitle());
    }
}
