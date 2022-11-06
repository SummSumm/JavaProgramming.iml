package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title , genre , director ;
    public int releaseYear;
    public ArrayList <String> casts = new ArrayList<>();      // INITIALIZE ET: Array list oldugu için



    public Movie(String country, String title, String genre, int releaseYear) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
       // casts = new ArrayList<>(); --> bu şekilde de olabilir ama riskli: parameter olarak da ekle
    }

    public Movie(ArrayList<String> casts) {
        this.casts = casts;
    }

    public void setCast (String cast) {
        casts.add(cast);
    }

    public void addCasts (String [] castsarr) {
        casts.addAll(Arrays.asList(castsarr));
    }


    public String toString() {
        return "Movie:" + "\n" +
                "country='" + country + "\n" +
                "title='" + title + "\n" +
                "genre='" + genre + "\n" +
                "releaseYear=" + releaseYear+ "\n" +
                "castCount=" + casts.size() + "\n" +
                "casts='" + casts;
    }
}
/*
	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

    3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */