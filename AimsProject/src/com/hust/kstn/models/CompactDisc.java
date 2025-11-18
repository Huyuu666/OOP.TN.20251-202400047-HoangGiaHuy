package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc{
    private List<String> artists = new ArrayList<>();
    private List<String> directors = new ArrayList<>();
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, double cost, String category, List<String> artists,
                       List<String> directors, List<Track> tracks) {
        super(title, cost, category);
        this.artists = artists;
        this.directors = directors;
        this.tracks = tracks;
    }

    public int totalLength() {
        int l = 0;
        int n = tracks.size();
        for(Track t : tracks) {
            l += t.getLength();
        }
        return l;
    }

    public List<String> getArtists() {
        return artists;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        tracks.add(track);
        System.out.println("Track added: ");
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: ");
        } else {
            System.out.println("Track not found: ");
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " - [" + totalLength()+ " ]"
                + "\nartists: " + this.artists
                + "\ndirectors: " + this.directors
                + "\ntracks: " + this.tracks;
    }
}
