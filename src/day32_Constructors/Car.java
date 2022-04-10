package day32_Constructors;

public class Car {


    public String brand, model, color;
    public int year;
    public double price;

    public Car(String brand){
        this.brand = brand;
    }
    public Car(String brand, String model){
        this(brand);
        this.model = model;
    }
    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
    }
    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
        this.price = price;
    }
    public Car(String brand, String model, int year, double price, String color){
        this(brand, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Car
		 instance variables:
		 		brand, model, year, price, color

 		1st constructor: initializes the brand ONLY

 		2nd constructor: initializes brand & model
 				(MUST use constructor call to set the brand)

		3rd constructor: initializes brand, model, year
				(MUST use constructor call to set the brand, model)

		4th constructor: initializes brand, model, year, price
				(MUST use constructor call to set the brand, model, year)

		5th Constructor: intializes all the instances
				(MUST use constructor call to set the brand, mode, year, price, color)

		instance methods: toString
 */