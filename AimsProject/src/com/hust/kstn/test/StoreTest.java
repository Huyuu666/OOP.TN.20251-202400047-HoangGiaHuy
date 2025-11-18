package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "Geogle Lucas", 87, 24.45);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Without Family", "Animation",
                "Hector Malot", 87, 21.1);

        store.removeDVD(dvd1); //Khong xoa duoc khi gio hang rong
        System.out.println();

        store.addDVD(dvd1);
        System.out.println();

        store.removeDVD(dvd1);
    }
}
