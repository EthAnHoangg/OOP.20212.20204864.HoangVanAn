package hust.soict.dsai.aims.disc;

import java.time.LocalDate;
import java.util.StringTokenizer;

public class DigitalVideoDisc {
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private LocalDate dateAdded;
    private static int nbDigitalVideoDiscs;

    //=============== Constructor ====================
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }
    //=============== Getter ====================

    public int getId() {
        return id;
    }

    public float getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }
    //=============== Setter ====================
    public void setLength(int length) {
        this.length = length;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //=============== Method ====================
    public String toString(){
        return "DVD - " + this.title +  " - " +
                this.category + " - " +
                this.director +  " - " +
                this.length + " : " +
                this.cost;
    }
    public boolean isMatch(String title){
        StringTokenizer str_token = new StringTokenizer(title);
        for (int i = 1; str_token.hasMoreTokens(); i++) {
            if (this.title.toUpperCase().contains(str_token.nextToken().toUpperCase())){
                return true;
            }
        }
        return false;
    }
}
