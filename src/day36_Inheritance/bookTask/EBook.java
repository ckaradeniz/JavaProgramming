package day36_Inheritance.bookTask;

public class EBook extends Book {

    public void readBook(){
        System.out.println("Reading " + title);
    }


}
/*
Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */