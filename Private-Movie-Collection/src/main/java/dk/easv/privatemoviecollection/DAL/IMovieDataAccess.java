package dk.easv.privatemoviecollection.DAL;

import dk.easv.privatemoviecollection.BE.MovieCollection;

import java.sql.SQLException;
import java.util.List;

public interface IMovieDataAccess {

    List<MovieCollection> getAllMovies() throws Exception;

    MovieCollection createMovie(MovieCollection newMovie) throws Exception;

    void deleteMovie(MovieCollection movie) throws Exception;

    void createGenre(String genre, List<MovieCollection> selectedMovies) throws Exception;

    //List<Genre> getAllGenre() throws Exception;

    List<MovieCollection> getMovieCollectionsByGenre(String genre) throws Exception;

    //void updateGenre(Genre genre, List<MovieCollection> selectedMovies) throws Exception;
}
