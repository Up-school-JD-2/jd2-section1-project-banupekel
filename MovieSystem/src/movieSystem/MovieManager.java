package movieSystem;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	
	 private List<Movie> movies;

	 
	    public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

		public MovieManager() {
	        this.movies = new ArrayList<>();
	    }

	    public void addMovie(Movie movie) {
	        movies.add(movie);
	    }

	    public void deleteMovie(int id) {
	        for (Movie movie : movies) {
	            if (movie.getId() == id) {
	                movies.remove(movie);
	                return;
	            }
	        }
	    }

		@Override
		public String toString() {
			return "MovieManager [movies=" + movies + "]";
		}
	    
	   
	
		
	

}
