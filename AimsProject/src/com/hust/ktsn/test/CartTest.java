package com.hust.ktsn.test;
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;
public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Guy Ritchie", 90, 18.99);
        
        System.out.println("=== Test: addDVD(dvd3) ===");
        cart.addDVD(dvd3);
        cart.print();

        System.out.println("=== Test: addDVD(dvd2, dvd3) ===");
        cart.addDVD(dvd2, dvd3);
        cart.print();

        System.out.println("=== Test: addDVD(varargs) ===");
        cart.addDVD(dvd1, dvd2, dvd3);
        cart.print();

        System.out.println("=== Test: removeDVD(dvd2) ===");
        cart.removeDVD(dvd2);
        cart.print();
        
        System.out.println("=== TEST : Remove NON-EXISTING DVD ===");
        cart.removeDVD(dvd2);  
        cart.removeDVD(dvd2);
        cart.print();

        System.out.println("=== TEST : Remove FROM EMPTY CART ===");
        cart.removeDVD(dvd1);  
        cart.removeDVD(dvd3);  
        cart.removeDVD(dvd3);
        cart.removeDVD(dvd3);
        cart.print();         

        cart.removeDVD(dvd1);  // Thử xóa tiếp khi giỏ rỗng → phải báo lỗi
        cart.print();
        
        System.out.println("=== TEST : ADDING MORE THAN 20 DVDS ===");
        Cart cart2 = new Cart();
        DigitalVideoDisc[] items = new DigitalVideoDisc[22];
        for (int i = 0; i < 22; i++) {
        	items[i] = new DigitalVideoDisc("DVD #" + i, "Test", "Tester", 90, 10.0);
        }
        for (int i = 0; i < 10; i++) {
            cart2.addDVD(items[i]);
        }
        cart2.addDVD(items[10], items[11]);
        cart2.addDVD(items[12], items[13], items[14], items[15],items[16]);
        cart2.addDVD(items[17]);
        cart2.addDVD(items[18]);
        cart2.addDVD(items[19]);
        cart2.addDVD(items[20]);
        cart2.addDVD(items[21]);
        cart2.print();
	}
}
