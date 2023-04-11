package movieSystem;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	
	private List<Movie> movies;
	
	public MovieManager() {
		this.movies = new ArrayList<>();
	}

	private Movie movie1 = new Movie(1L, "Marvelous Mrs. Maisel", "Amy Sherman-Palladino", 
			new String[] {"Rachel Brosnahan", "Alex Borstein", "Michael Zegen", "Marin Hinkle", "Tony Shalhoub"}, 
			"2017", "a New York housewife who discovers she has a knack for stand-up comedy and pursues a career in it.", "comedy");
	private Movie movie2 = new Movie(2L, "Suits", "Dan Stoloff", 
			new String[] {"Gabriel Macht", "Patrick J. Adams", "Rick Hoffman", "Meghan Markle", "Sarah Rafferty"}, 
			"2011", "Suits focuses on Harvey and Mike winning lawsuits and closing cases, while at the same time hiding Mike's secret.", "legal drama");
	
	public void initializeMovies() {
		movies.add(movie1);
		movies.add(movie2);
	}
	public void printMovies() {
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	public void removeMovieByName(String movieName) {
		for(Movie movie : movies) {
			if(movie.getName().equalsIgnoreCase(movieName)) {
				movies.remove(movie);
				break;
			}
		}
	}
	public Movie searchMovieByName(String movieName) {
		Movie searchedMovie = null;
		for(Movie movie : movies) {
			if(movie.getName().equalsIgnoreCase(movieName)) {
				searchedMovie = movie;
			}
		}
		return searchedMovie;
	}
	
	@Override
	public String toString() {
		return "MovieManager [movies=" + movies + "]";
	}

	
}
