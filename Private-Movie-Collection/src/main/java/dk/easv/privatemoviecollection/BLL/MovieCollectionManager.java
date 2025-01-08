package dk.easv.privatemoviecollection.BLL;

import dk.easv.privatemoviecollection.BE.MovieCollection;

import java.io.IOException;
import java.util.List;
import dk.easv.privatemoviecollection.DAL.IMovieDataAccess;
import dk.easv.privatemoviecollection.DAL.MovieCollectionDAO;

public class MovieCollectionManager {
    private final IMovieDataAccess dataAccess;

  public MovieCollectionManager() throws IOException {
      dataAccess = new MovieCollectionDAO();
  }


    public List<MovieCollection> getAllMovies() throws Exception {
        return dataAccess.getAllMovies();
    }

}
