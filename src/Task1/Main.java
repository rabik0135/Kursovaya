package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<CBookCard> bookCards = new ArrayList<>(5);
        CBookCard bookCard1 = new CBookCard(
                "Михаил Булгаков",
                "Мастер и Маргарита",
                "Азбука",
                2012,
                "978-5-389-01686-6",
                "821.161.1-31",
                30000
        );
        bookCard1.setRating(10);

        CBookCard bookCard2 = new CBookCard(
                "Агата Кристи",
                "Десять негритят",
                "Эскмо",
                2021,
                "978-5-04-103497-9",
                "821.111-312.4",
                100000000
        );
        bookCard2.setRating(7);

        CBookCard bookCard3 = new CBookCard(
                "Стивен Кинг",
                "11/22/63",
                "АСТ",
                2011,
                "978-5-17-089416-1",
                "821.111-313.2(73)",
                136000
        );
        bookCard3.setRating(10);
        CBookCard bookCard4 = new CBookCard(
                "Фрэнк Герберт",
                "Дюна",
                "АСТ",
                1965,
                "978-5-17-118933-4",
                "821.111-312.9(73)",
                20000000
        );
        bookCard4.setRating(9);
        CBookCard bookCard5 = new CBookCard(
                "Джоан Роулинг",
                "Гарри Поттер и Философский камень",
                "Росмэн",
                1997,
                "978-5-353-00308-3",
                " 821.111-312.9-93",
                50000
        );
        bookCard5.setRating(6);
        System.out.println(bookCard1);
        System.out.println(bookCard2);
        System.out.println();

        bookCards.add(bookCard1);
        bookCards.add(bookCard2);
        bookCards.add(bookCard3);
        bookCards.add(bookCard4);
        bookCards.add(bookCard5);

        System.out.println("Массив до сортировки: ");
        System.out.println(bookCards);

        CBookCard.sort(bookCards);
        System.out.println("\nМассив после сортировки: ");
        System.out.println(bookCards);
    }
}