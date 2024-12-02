package __TecheerPartners_teamA.MovieSearch.Entity;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    public Movie(){}

    public Movie(String title){
        this.title = title;
    }



}
