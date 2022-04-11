package day38_Inheritence.carTask;

public class Tesla extends Car{


    public Tesla(String model, int year, double price, String color, double miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){

        System.out.println(brand + " "+ model+ " in autopilot mode");

    }

}
/*
3. Tesla:
					extra methods:
						autoPilot();
 */