package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.*;

@Entity
public class SeriesAndMovies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String genre;
    private Integer releaseYear;

    // "MOVIE" oder "SERIES"
    private String type;

    // URL zum Poster-Bild (z.B. https://image.tmdb.org/... oder eigene URL)
    private String posterUrl;

    public SeriesAndMovies() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Integer getReleaseYear() { return releaseYear; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPosterUrl() { return posterUrl; }
    public void setPosterUrl(String posterUrl) { this.posterUrl = posterUrl; }
}