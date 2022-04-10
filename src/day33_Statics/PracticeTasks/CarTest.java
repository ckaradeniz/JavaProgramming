package day33_Statics.PracticeTasks;

public class CarTest {

    public static void main(String[] args) {


        Car car1 = new Car("Mercedes", "E200", "black", 2020, 15000);

        System.out.println(car1);
        car1.drive();
    }
}
