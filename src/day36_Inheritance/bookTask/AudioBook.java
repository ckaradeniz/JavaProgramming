package day36_Inheritance.bookTask;

public class AudioBook extends Book{

    public void listen(){
        System.out.println("Listening " + title);
    }

}
/*
 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()

 */