package com.hust.kstn.models;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String artist, double cost) {
        super(title, category, cost, 0, null);
    	this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added.");
        } else {
            System.out.println("Track already exists.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed.");
        } else {
            System.out.println("Track does not exist.");
        }
    }

    public int totalLength() {
        int total = 0;
        for (Track t : tracks) {
            total += t.getLength();
        }
        return total;
    }

    public String toString() {
        return "CD" + super.toString()
                + "[" + artist + "]\nTracks:\n" + tracks
                + "\nTotal length = " + totalLength();
    }
}
