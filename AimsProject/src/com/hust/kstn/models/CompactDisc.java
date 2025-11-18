package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<String> artists = new ArrayList<>();
    private List<String> directors = new ArrayList<>();
    private List<Track> tracks = new ArrayList<>();
    private static int nbCompactDisc  = 0;

    public CompactDisc() {
        nbCompactDisc++;
        this.id = nbCompactDisc;
    }
    public CompactDisc(String title, String category, double cost, List<String> artists,
                       List<String> directors, List<Track> tracks) {
        nbCompactDisc++;
        this.id = nbCompactDisc;
        this.title = title;
        this.category = category;
        this.cost = cost;
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
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
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
        return "- CompactDisc[" + this.id + "] - ["
                + this.title + "] - ["
                + this.cost + "] - ["
                + this.category + "] - ["
                + totalLength()+ "]"
                + "\nartists: " + this.artists
                + "\ndirectors: " + this.directors
                + "\ntracks: " + this.tracks;
    }
}
