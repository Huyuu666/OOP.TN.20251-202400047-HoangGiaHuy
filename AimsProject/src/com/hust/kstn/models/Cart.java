package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private final DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public Cart() {
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added sucessfully");
        }
    }

    public void removeDVD (DigitalVideoDisc disc) {
        int found = 0;
        if(qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsInCart[i].equals(disc)) {
                found = 1;
                for(int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j+1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered --;
                System.out.println("The disc has been removed sucessfully");
                break;
            }
        }

        if(found == 0) {
            System.out.println("The disc does not exist");
        }
    }

    public double calculatorTotalCost() {
        double totalCost = 0.0;
        for(int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsInCart[i].getCost();
        }
        return totalCost;
    }

    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("=== All items in cart ===");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println("[Title]: " + itemsInCart[i].getTitle() + ", "
                    + "[Cost]: " + itemsInCart[i].getCost());
        }
    }

}
