package com.hust.ktsn.test;
import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;
public class StoreTest {

	public static void main(String[] args) {
		 Store store = new Store();

	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Guy Ritchie", 90, 18.99);

	        System.out.println("=== TEST: Adding DVDs to Store ===");
	        store.addDVD(dvd1);
	        store.addDVD(dvd2);
	        store.addDVD(dvd3);
	        store.printStore();

	        System.out.println("\n=== TEST: Removing DVD from Store ===");
	        store.removeDVD(dvd2);
	        store.printStore();

	        System.out.println("\n=== TEST: Removing Non-existing DVD ===");
	        store.removeDVD(dvd2);   
	        store.printStore();
	}
}
