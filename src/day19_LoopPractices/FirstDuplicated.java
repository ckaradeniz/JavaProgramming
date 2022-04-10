package day19_LoopPractices;

public class FirstDuplicated {

    public static void main(String[] args) {

        String str = "abccdddd";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);


            if(str.indexOf(ch) != str.lastIndexOf(ch)){

                System.out.println(ch);

                break;
            }

        }









    }
}
/*Write a program that can return the first duplicated character
        from a string
 */
