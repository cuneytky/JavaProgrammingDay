package day31_Constructors.Task03_Movie;

import java.util.Arrays;

public class MovieObject {

    public static void main(String[] args) {

        Movie movie=new Movie("USA","Journey to EU-11",
                "06/06/2023","Kuzzat Altay");

        String[] cast ={"Asiya","Muhtar","Adam","Muhammed","Yavuz","Caner","Edip","Arif"};
        movie.addCasts(cast);
        System.out.println(movie);
    }
}
//Asiya, Adam, Muhtar and 5 more students
//("Asiya","Muhtar","Adam","Muhammed","Yavuz","Caner","Edip","Arif")