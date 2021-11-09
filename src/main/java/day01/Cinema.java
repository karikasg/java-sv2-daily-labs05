package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time){
        List<String> moviesByTime = new ArrayList<>();
        for (Movie movie : movies){
            for (int i=0; i<movie.getTimes().size(); i++) {
                if (movie.getTimes().get(i).equals(time)) {
                    moviesByTime.add(movie.getTitle());
                }
            }
        }
        return moviesByTime;
    }
}
