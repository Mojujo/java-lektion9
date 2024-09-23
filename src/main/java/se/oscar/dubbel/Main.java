package se.oscar.dubbel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Afton");
        Magazine magazine = new Magazine("KD", 150);
        Magazine magazine2 = new Magazine("HELLO", 30);
        Magazine magazine3 = new Magazine("SVD", 70);

        Magazine[] magazines = {magazine, magazine2, magazine3};
        Shop shop = new Shop(magazines);
        shop.showMagazines();

        magazine.setPublisher(publisher); // SET PUBLISHER
        System.out.println(magazine.getPublisher().getName());


        publisher.setMagazine(magazine); // SET MAGAZINE
        System.out.println(publisher.getMagazine().getName());
        System.out.println(publisher.getMagazine().getPrice());
    }
}
