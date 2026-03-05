# Series & Movies Manager

Ein Spring Boot Webprojekt zur Verwaltung von Filmen und Serien mit Thymeleaf-Frontend im Netflix-Style.


## Technologien

- **Java** mit **Spring Boot**
- **Thymeleaf** (Server-Side Rendering)
- **Spring Data JPA** + **H2 Datenbank**
- **HTML / CSS** (Custom Netflix-Style Design)


## URL-Übersicht

| Seite | URL | Beschreibung |
|---|---|---|
| Startseite | `/series-movies` | Hero-Landingpage |
| Library | `/series-movies/manage` | Alle Einträge als Card-Grid |
| Neu hinzufügen | `/series-movies/new` | Formular für neuen Eintrag |
| Bearbeiten | `/series-movies/edit/{id}` | Formular mit bestehenden Daten |
| Löschen | `/series-movies/delete/{id}` | Löscht Eintrag, Redirect zur Library |


## Datenmodell — `SeriesAndMovies`

| Feld | Typ | Beschreibung |
|---|---|---|
| `id` | `int` | Primärschlüssel (auto-generiert) |
| `name` | `String` | Titel des Films / der Serie |
| `genre` | `String` | Genre (z.B. "Sci-Fi, Drama") |
| `releaseYear` | `Integer` | Erscheinungsjahr |
| `type` | `String` | `"MOVIE"` oder `"SERIES"` |
| `posterUrl` | `String` | URL zu einem Poster-Bild (optional) |


## Features

- **CRUD** — Erstellen, Lesen, Bearbeiten, Löschen von Einträgen
- **Typ-Auswahl** — Movie oder Series per Toggle-Button im Formular
- **Poster-Bild** — Poster-URL einfügen, wird als Bild in der Card angezeigt
- **Live-Vorschau** — Splitscreen-Formular zeigt Eingaben in Echtzeit
- **Suchfunktion** — Filtern nach Name und Genre (clientseitig)
- **Typfilter** — Nur Movies oder nur Series anzeigen
- **Responsive Design** — Funktioniert auf Desktop und Mobil


## Starten

1. Projekt in IntelliJ öffnen
2. `SpringThymeleafApplication.java` ausführen
3. Browser öffnen → [`localhost:8080/series-movies`](http://localhost:8080/series-movies)


## Notizen

- Die Datenbank ist eine **H2 In-Memory Datenbank** — Daten werden beim Neustart zurückgesetzt
- Poster-Bilder werden nicht hochgeladen, sondern nur als **URL** gespeichert (z.B. von [TMDB](https://www.themoviedb.org))
- Bei neuen Feldern in der Entity: `spring.jpa.hibernate.ddl-auto=update` in `application.properties` setzen