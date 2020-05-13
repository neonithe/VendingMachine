package se.lexicon.data;

public abstract class Product {

    private int stock;
    private int price;
    private String name;
    private int size;
    private int calories;


    public Product(int stock, int price, String name, int size, int calories) {
        this.stock = stock;
        this.price = price;
        this.name = name;
        this.size = size;
        this.calories = calories;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public abstract String examine();

    @Override
    public String toString() {
        return "Product: " + "Stock: " + stock + ", Price: " + price + ", Name: " + name + ", Size: " + size + ", Calories: " + calories;
    }


}
