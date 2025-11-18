package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {
    public static void main(String[] args) {
        Track t1 = new Track("Lac Troi",3);
        Track t2 = new Track("Bac Phan", 4);
        Track t3 = new Track("Khong the say", 4);

        List<Track> tracks = new ArrayList<>();
        tracks.add(t1);
        tracks.add(t2);

        List<String> artists = new ArrayList<>();
        artists.add("GH");
        artists.add("DM");

        List<String> directors = new ArrayList<>();
        directors.add("GH");

        CompactDisc compactDisc = new CompactDisc("Chill", 20,"Love", artists,
                directors, tracks);

        System.out.println(compactDisc.toString());
    }
}
