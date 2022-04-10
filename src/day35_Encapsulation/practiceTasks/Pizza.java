package day35_Encapsulation.practiceTasks;

public class Pizza {


    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large"))){
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0){
            return;
        }
        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3){
            return;
        }
        if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4){
            return;
        }
        if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5){
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0){
            return;
        }
        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 4){
            return;
        }
        if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 5){
            return;
        }
        if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 6){
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public int calcCost(){

        int pizzaCost=0;

        if (size.equalsIgnoreCase("small")){
            pizzaCost = 10;
        }
        if(size.equalsIgnoreCase("medium")){
            pizzaCost = 12;
        }
        if(size.equalsIgnoreCase("large")){
            pizzaCost = 14;
        }

        return pizzaCost + (numberOfCheeseTopping) * 2 + (numberOfPepperoniTopping *2);

    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost
					as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */