package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95);


        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "Geogle Lucas", 87, 24.45);

        cart.addDVD(dvd1);
        cart.print();
        System.out.println("Total cost: " + cart.calculatorTotalCost());

        System.out.println();

        cart.addDVD(dvd2);
        cart.print();
        System.out.println("Total cost: " + cart.calculatorTotalCost());

        System.out.println();

        cart.removeDVD(dvd2);
        cart.print();
    }
}