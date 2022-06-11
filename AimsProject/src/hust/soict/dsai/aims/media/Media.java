package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public abstract class Media {
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
        this.id = nbMedia;
        nbMedia ++;
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
        } else {
            return false;
        }
    }


}
