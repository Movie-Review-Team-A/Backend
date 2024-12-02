package MovieSearch.service;

import MovieSearch.Entity.Movie;
import MovieSearch.dto.MovieReqeuestDto;
import MovieSearch.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieSearchService {

    private final MovieRepository movieRepository;

    public MovieSearchService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public void searchMovie(MovieReqeuestDto dto){
        Movie movie = new Movie(dto.getTitle());
        movieRepository.save(movie);
    }
}
