package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public boolean equals(Object o){
        if (o instanceof Track) {
            return getTitle().equalsIgnoreCase(((Track) o).getTitle())
                    & getLength() == ((Track) o).getLength();
        }
        return false;
    }

    public String toString(){
        return "Track's title: " + getTitle() + '\n'
         + "Track's length: " + getLength();
    }
    public void play(){
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
}
