package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; //static and final bt default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */


    void play();// abstract by default

}
