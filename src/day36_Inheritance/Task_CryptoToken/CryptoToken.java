package day36_Inheritance.Task_CryptoToken;

public class CryptoToken {
    private double price, marketCap;
    private int quantity;
    private boolean isMineable;
    private double circulatingSupply;


    public void setInfo(double price, double marketCap, int quantity, boolean isMineable, double circulatingSupply) {
        setPrice(price);
        setQuantity(quantity);
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0 ){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0 ){
            System.err.println("Invalid quantity: "+quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public double totalPrice(){
        return getPrice()*getQuantity();
    }

    public String toString() {
        return "CryptoToken{" +
                getClass().getSimpleName()+
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", isMineable=" + isMineable +
                ", circulatingSupply=" + circulatingSupply +
                '}';
    }
}
/*
6. CryptoToken Task
	1. create a class called CryptoToken
		variables:
		   price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)
			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)
	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge
	3. create a class named MyWallet
		create one object of each CryptoToken
		calculate the total Asset
 */