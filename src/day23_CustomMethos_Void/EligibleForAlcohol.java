package day23_CustomMethos_Void;

public class EligibleForAlcohol {

    public static void main(String[] args) {

        eligibleForAlcohol(13);


    }

    //3. create a method that can check if a person is eligible to buy alcohol

    public static void eligibleForAlcohol(int age){

        if (age>=16){
            System.out.println("Eligible to buy alcohol.");
        }else{
            System.out.println("Not eligible to buy alcohol.");
        }
    }
}
