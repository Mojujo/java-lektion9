package se.oscar.dubbel;

import java.util.Arrays;

public class Shop {
    private Magazine[] magazines;

    public Shop(Magazine[] magazines) {
        this.magazines = magazines;
    }

    public void showMagazines() {
        for (Magazine magazine : magazines) {
            System.out.println(magazine.getName() + " " + magazine.getPrice());
        }
    }
}
