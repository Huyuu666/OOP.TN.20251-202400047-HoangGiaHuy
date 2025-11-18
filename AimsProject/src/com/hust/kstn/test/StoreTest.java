package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 19.95,"Animation",
                "Roger Allers", 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 24.45, "Science Fiction",
                "Geogle Lucas", 87);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Without Family", 21.1, "Animation",
                "Hector Malot", 87);

        store.removeDVD(dvd1); //Khong xoa duoc khi gio hang rong
        System.out.println();

        store.addDVD(dvd1);
        System.out.println();

        store.removeDVD(dvd1);
    }
}
