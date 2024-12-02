package __TecheerPartners_teamA.MovieSearch.controller;

import __TecheerPartners_teamA.MovieSearch.dto.MovieReqeuestDto;
import __TecheerPartners_teamA.MovieSearch.service.MovieSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieSearchController {

    private final MovieSearchService movieSearchService;

    public  MovieSearchController(MovieSearchService movieSearchService){
        this.movieSearchService = movieSearchService;
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> SearchMovie (@RequestBody MovieReqeuestDto dto){
        movieSearchService.searchMovie(dto);
        Map<String, String> response = new HashMap<>();
        response.put("message", "조회한 영화입니다.");
        return ResponseEntity.status(201).body(response);
    }
}
