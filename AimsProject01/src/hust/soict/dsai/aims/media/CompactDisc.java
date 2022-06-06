package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    ArrayList<Track> tracks = new ArrayList<>();

    public String getArtist(String title) {
        return artist;
    }

    public CompactDisc(String title, String category, String director, float cost,
                      int length, String artist, ArrayList<Track> tracks){
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public boolean checkTrackAvailable(ArrayList<Track> trackArrayList, Track track){
        for (Track check: trackArrayList){
            if (check.getTitle().equalsIgnoreCase(track.getTitle())){
                return true;
            }
        }
        return false;
    }

    public void addTrack(Track track){
        if (checkTrackAvailable(tracks, track)){
            System.out.println("Track has already been added!");
        } else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track){
        if (checkTrackAvailable(tracks, track)){
            tracks.remove(track);
        } else {
            System.out.println("No track found!");
        }
    }

    public void removeTrack (String title){
        for (Track track: tracks){
            if (track.getTitle().equalsIgnoreCase(title)){
                removeTrack(track);
            }
        }
        System.out.println("No track found!");
    }

    public int getLength(){
        int length = 0;
        for (Track track: tracks){
            length += track.getLength();
        }
        return length;
    }

    public void play(){
        for (Track track: tracks){
            track.play();
        }
    }
}
