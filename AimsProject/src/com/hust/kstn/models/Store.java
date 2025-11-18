package com.hust.kstn.models;

public class Store {
    private static final int MAX_NUMBER_ORDERED = 100;
    private final DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;
    
    public Store() {}

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The Store is almost full");
        } else {
            itemsInStore[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added sucessfully");
        }
    }
    
    public void removeDVD (DigitalVideoDisc disc) {
        int found = 0;
        if(qtyOrdered == 0) {
            System.out.println("The Store is empty");
            return;
        }
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsInStore[i].equals(disc)) {
                found = 1;
                for(int j = i; j < qtyOrdered - 1; j++) {
                    itemsInStore[j] = itemsInStore[j+1];
                }
                itemsInStore[qtyOrdered - 1] = null;
                qtyOrdered --;
                System.out.println("The disc has been removed sucessfully");
                break;
            }
        }

        if(found == 0) {
            System.out.println("The disc does not exist");
        }
    }
}
