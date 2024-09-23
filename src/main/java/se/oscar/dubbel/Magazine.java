package se.oscar.dubbel;

public class Magazine {
    private String name;
    private int price;
    private Publisher publisher;

    public Magazine(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
