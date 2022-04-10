package day33_Statics.PracticeTasks;

public class IphoneTest {

    public static void main(String[] args) {


        Iphone iphone1 = new Iphone("Iphone 13 Plus", 1500, "white", "5.6 inches" );

        System.out.println(iphone1);

        iphone1.call(12345678);
        iphone1.faceTime("cefhnsj@dhsnd.com");
        iphone1.text(123455677);


    }
}
