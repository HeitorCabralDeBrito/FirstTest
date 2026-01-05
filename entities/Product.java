package entities;

public class Product {

    public String name;
    public float price;
    public int quantity;

    public Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + price + ", " + quantity + " units. Total: $ " + totalValueInStock();
    }

}
