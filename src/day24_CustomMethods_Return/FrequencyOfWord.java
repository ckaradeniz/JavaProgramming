package day24_CustomMethods_Return;

public class FrequencyOfWord {

    public static void main(String[] args) {


        String sentence = "Java java java python python";
        String word = "java";


        int frequency = frequencyOfWord(sentence,word);

        System.out.println(frequency);


    }


    public static int frequencyOfWord(String sentence, String word){

        int frequency = 0;
        for (int i = 0; i < sentence.length()-word.length(); i++) {

            String wrd = sentence.substring(i, i + word.length());

            if (word.equalsIgnoreCase(wrd)){
                frequency++;
            }

        }

        return frequency;

    }


}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns
the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
