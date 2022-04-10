package day36_Inheritance.bookTask;

public class BookObjects {

    public static void main(String[] args) {

        EBook ebook = new EBook();
        ebook.setInfo("Beyoglu Rapsodisi", "Novel", "Ahmet Umit", 10);

        ebook.readBook();


        System.out.println(ebook);



        AudioBook audioBook = new AudioBook();
        audioBook.setInfo("Suc ve Ceza", "Novel","Dostoyevski", 15 );

        audioBook.listen();

        System.out.println(audioBook);



    }
}
