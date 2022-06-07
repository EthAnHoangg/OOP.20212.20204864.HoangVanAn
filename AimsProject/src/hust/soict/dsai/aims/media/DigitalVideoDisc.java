package hust.soict.dsai.aims.media;

import java.util.StringTokenizer;

public class DigitalVideoDisc extends Disc implements Playable {
    private int id = super.getId();
    private String director;
    private int length;

    //    =============== Constructor ====================
    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, int length, float cost){
        super(title, category, cost);
        this.length = length;
    }

    //=============== Getter ====================
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    //=============== Setter ====================
    public void setLength(int length) {
        this.length = length;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    //=============== Method ====================
    public String toString(){
        return "DVD - " + getTitle() +  " - " +
                getCategory() + " - " +
                this.director +  " - " +
                this.length + " : " +
                getCost();
    }

    public boolean isMatch(String title){
        StringTokenizer str_token = new StringTokenizer(title);
        for (int i = 1; str_token.hasMoreTokens(); i++) {
            if (getTitle().toUpperCase().contains(str_token.nextToken().toUpperCase())){
                return true;
            }
        }
        return false;
    }

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
