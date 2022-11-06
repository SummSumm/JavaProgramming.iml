package day31_Constructors;

import java.util.Arrays;

public class MovieTest {
    public static void main(String[] args) {

        Movie m1 = new Movie("USA", "Journey to SDET", "Kuzzat Altay", 2022);
        m1.genre = "Adventure";

        String[] stars = {"Asiya", "Muhtar", "Omer", "Oscar", "Akbar" };

        m1.addCasts(stars);

        System.out.println(m1);
    }
}
/*
1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

 */