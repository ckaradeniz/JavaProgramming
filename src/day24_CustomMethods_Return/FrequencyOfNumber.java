package day24_CustomMethods_Return;

public class FrequencyOfNumber {

    public static void main(String[] args) {

        int[] array = {1,1,1,1,1,2,2};

        int frequency = frequencyOfNumber(array,2);

        System.out.println(frequency);


    }



    public static int frequencyOfNumber(int[] arr,int element ){

        int frequency = 0;
        for (int each : arr) {

            if (each==element){

                frequency++;
            }

        }
        return  frequency;

    }


}
/*

    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */