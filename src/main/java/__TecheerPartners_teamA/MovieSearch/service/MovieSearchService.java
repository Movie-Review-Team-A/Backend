package __TecheerPartners_teamA.MovieSearch.service;

import __TecheerPartners_teamA.MovieSearch.Entity.Movie;
import __TecheerPartners_teamA.MovieSearch.dto.MovieReqeuestDto;
import __TecheerPartners_teamA.MovieSearch.repository.MovieRepository;
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
