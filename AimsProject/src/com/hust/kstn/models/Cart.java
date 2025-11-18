package com.hust.kstn.models;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public void addDVD(DigitalVideoDisc disc) {
	    if (qtyOrdered >= MAX_NUMBER_ORDERED) {
	        System.out.println("The cart is almost full");
	        return;
	    }
	    itemsInCart[qtyOrdered++] = disc;
	    System.out.println("The disc has been added successfully");
	 }
	
	 public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
	    this.addDVD(disc1);
	    this.addDVD(disc2);
	}

	public void addDVD(DigitalVideoDisc... discs) {
		for(DigitalVideoDisc disc : discs) {
			this.addDVD(disc);
		}
    }

    public void removeDVD(DigitalVideoDisc disc) {
    	if (qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        int index = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("The disc does not exist");
        } else {
            for (int i = index; i < qtyOrdered - 1; i++) {
                itemsInCart[i] = itemsInCart[i + 1];
            }
            itemsInCart[--qtyOrdered] = null;
            System.out.println("The disc has been removed successfully");
        }
    }
    
    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
        	DigitalVideoDisc d = itemsInCart[i];
        	if (d != null) {
                 totalCost += d.getCost();
        	}
        }
        return totalCost;
    }
    
    public void print() {
    	if(qtyOrdered == 0) {
    		System.out.println("The cart is empty");
    		return;
    	} else {
    	    System.out.println("======================= THE CURRENT CART =======================");
            System.out.println("Total items:" + qtyOrdered);
            
            for (DigitalVideoDisc item : itemsInCart) {
            	if(item != null) {
            		System.out.println("-" + item.toString());
            	}
            }
            System.out.println("Subtotal: " + calculateTotalCost() + "$");
    	    System.out.println("=================================================================================");
          }
    }
}
