package com.hust.kstn.models;

public class Store {
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore >= 100) {
            System.out.println("The store is full");
            return;
        }
        itemsInStore[qtyInStore++] = disc;
        System.out.println("DVD added to the store: " + disc.getTitle());
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyInStore == 0) {
            System.out.println("The store is empty!");
            return;
        }
        int index = -1;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("DVD not found in the store.");
            return;
        }
        for (int i = index; i < qtyInStore - 1; i++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }
        itemsInStore[--qtyInStore] = null;
        System.out.println("DVD removed from the store: " + disc.getTitle());
    }

    public void printStore() {
        System.out.println("===== THE STORE =====");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
            return;
        }
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println("- " + itemsInStore[i].toString());
        }
    }
}
