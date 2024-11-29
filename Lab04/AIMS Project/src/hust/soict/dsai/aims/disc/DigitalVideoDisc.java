package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        setDirector(director);
        setLength(length);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title) {
        super();
        setTitle(title);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public static boolean contains(DigitalVideoDisc dvd1) {
        return DigitalVideoDisc.contains(dvd1);
    }

    public static void add(DigitalVideoDisc dvd1) {
        if (!contains(dvd1)) {
            DigitalVideoDisc.add(dvd1);
            System.out.println(dvd1.getTitle() + " has been added to the cart.");
        } else {
            System.out.println(dvd1.getTitle() + " is already in the cart.");
        }
    }
}

