package models;

/**
 * Created by Admin on 20/7/2561.
 */
public class Ice {
    private  String id,name;
    private String brand;
    private String size;
    private String number;
    private double price;

    public Ice() {
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public
    String getSize() {return size;}

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}


    public Ice(String id, String name, String brand,String number ,String size, double price) {

        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.number = number;
        this.size = size;
    }
}
