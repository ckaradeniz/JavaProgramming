package day38_Inheritence.carTask;

public class BMW extends Car{


    public BMW(String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " "+ model+ " is braking down");

    }

    public void racing(){

        System.out.println(brand + " " + model+ " is racing car");
    }

    public void start(){
        System.out.println("Call mechanic to jump start "+ brand + " "+ model);
    }

}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */