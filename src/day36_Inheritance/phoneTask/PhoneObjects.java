package day36_Inheritance.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {


        Iphone Iphone = new Iphone();
        Iphone.setInfo("Iphone", "13Pro", "medium", 1400, "black");


        Iphone.call(123456789);
        Iphone.text(123456789);
        Iphone.faceTime(1234321);
        Iphone.faceTime("ck@gmail.com");


        System.out.println(Iphone);


        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "Galaxy", "large", 700, "white");

        samsung.call(1234567);
        samsung.text(1234567);
        samsung.freeze();

        System.out.println(samsung);


        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia", "1100", "small", 120, "grey");

        nokia.call(12345678);
        nokia.text(12345678);
        nokia.selfDefence();

        System.out.println(nokia);





    }
}
/*
1.5 Create a class named Phone Objects and test of the sub class' objects
 */