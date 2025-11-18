package com.hust.ktsn.test;
import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;
public class CompactDiscTest {

	public static void main(String[] args) {
		CompactDisc cd = new CompactDisc("Onepiece", "Pop", "ABC", 19.99);
        Track t1 = new Track("Hello", 300);
        Track t2 = new Track("Bye", 285);
        Track t3 = new Track("Yoyo", 250);

        System.out.println("=== ADD TRACKS ===");
        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t1);   
        cd.addTrack(t3);
        System.out.println(cd);

        System.out.println("=== REMOVE TRACK ===");
        cd.removeTrack(t2);
        cd.removeTrack(t2); 
        System.out.println(cd);

        System.out.println("=== CD INFORMATION ===");
        System.out.println(cd);
	}
}
