package hust.soict.dsai.aims.media;

public class Disc extends Media{
    private int id = super.getId();
    private String director;
    private int length;

//  ============== Constuctor ============
    public Disc(){}
    public Disc(String title, String category, float cost){
        super(title, category, cost);
    }

    public Disc(String title, String category, String director, int length, float cost){
        super (title, category, cost);
        this.director =  director;
        this.length = length;
    }

//  ============== Getter =============
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public String toString(){
        return "Disc - " + getTitle() +  " - " +
                getCategory() + " - " +
                this.director +  " - " +
                this.length + " : " +
                getCost();
    }

}
