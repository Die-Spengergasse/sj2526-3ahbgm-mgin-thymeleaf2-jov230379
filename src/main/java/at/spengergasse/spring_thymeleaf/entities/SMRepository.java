package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface SMRepository extends CrudRepository<SeriesAndMovies, Integer> {

    // Gibt alle Einträge eines bestimmten Typs zurück ("MOVIE" oder "SERIES")
    List<SeriesAndMovies> findByType(String type);
}