package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 19.95, "Animation",
                "Roger Allers", 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 24.45,  "Science Fiction",
                "Geogle Lucas", 87);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Without Family",21.1, "Animation",
                "Hector Malot", 87);

        DigitalVideoDisc[] discs = new DigitalVideoDisc[3];
        discs[0] = dvd1;
        discs[1] = dvd2;
        discs[2] = dvd3;

        cart.removeDVD(dvd1); //Khong xoa duoc khi gio hang rong
        System.out.println();

        cart.addDVD(dvd1); //add 1
        System.out.println();

        cart.removeDVD(dvd2); //Khong xoa duoc dvd khong ton tai
        System.out.println();

        cart.addDVD(dvd2,dvd3); //add 2
        cart.print();
        System.out.println("Total cost: " + cart.calculatorTotalCost());
        System.out.println();

        cart.addDVD(discs); //add mang
        cart.print();
        System.out.println();
        for(int i = 0; i < 5; i++) {
            cart.addDVD(discs);
        }//gio hang day
    }
}
