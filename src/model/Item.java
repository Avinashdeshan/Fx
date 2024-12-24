package model;

public class Item {
    private String id;
    private String name;
    private int qty;
    private double price;
    private String dis;

    public Item(String id,String name,int qty,double price,String dis) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.dis = dis;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public String getDis() {
        return dis;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", dis='" + dis + '\'' +
                '}';
    }
}
