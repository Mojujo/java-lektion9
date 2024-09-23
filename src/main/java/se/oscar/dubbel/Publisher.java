package se.oscar.dubbel;

public class Publisher {
    private String name;
    private Magazine magazine;

    public Publisher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Magazine getMagazine() {
        return magazine;
    }
    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
}
