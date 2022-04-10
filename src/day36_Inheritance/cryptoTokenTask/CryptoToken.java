package day36_Inheritance.cryptoTokenTask;

public class CryptoToken {


    public double price;
    public double quantity;
    public double marketCap;
    public double volume;
    public long circulatingSupply;
    public boolean isMineable;

    public void setInfo(double price, double quantity, double marketCap, double volume, long circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double totalPrice(){
        return price * quantity;
    }


    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)
 */