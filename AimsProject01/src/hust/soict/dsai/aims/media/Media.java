package hust.soict.dsai.aims.media;

import java.time.LocalDate;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia;
    private LocalDate dateAdded;

    public int getId() {
        return id;
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

    
}
