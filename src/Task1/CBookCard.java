package Task1;

import java.util.ArrayList;
import java.util.Comparator;

public class CBookCard {
    private String author;
    private String title;
    private String publishingHouse;
    private int year;
    private String ISBN;
    private String udc;
    private int edition;
    private int rating;

    public CBookCard(String author, String title, String publishingHouse, int year, String ISBN, String udc, int edition) {
        this.author = author;
        this.title = title;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.ISBN = ISBN;
        this.udc = udc;
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getUdc() {
        return udc;
    }

    public void setUdc(String udc) {
        this.udc = udc;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating > 10) {
            System.out.println("Неправильно введено значение рейтинга. Значение будет округлено до ближайшего допустимого. ");
            rating = 10;
        }
        if (rating < 0) {
            System.out.println("Неправильно введено значение рейтинга. Значение будет округлено до ближайшего допустимого. ");
            rating = 0;
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CBookCard{" +
                "Автор: " + author +
                ", Заглавие: " + title +
                ", Издательство: " + publishingHouse +
                ", Год издания: " + year +
                ", ISBN: " + ISBN +
                ", УДК: " + udc +
                ", Тираж: <" + edition + '>' +
                ", Рейтинг: <" + rating + '>' +
                '}' + "\n";
    }

    public static void sort(ArrayList<CBookCard> bookCards) {
        bookCards.sort(Comparator.comparing(CBookCard::getYear));
    }

}