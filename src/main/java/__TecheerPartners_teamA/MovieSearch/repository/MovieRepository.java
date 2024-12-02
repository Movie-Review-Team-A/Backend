package __TecheerPartners_teamA.MovieSearch.repository;

import __TecheerPartners_teamA.MovieSearch.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
