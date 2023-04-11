package movieSystem;

import java.util.Arrays;

public class Movie {

	private Long ID;
	private String name;
	private String director;
	private String[] cast;
	private String date;
	private String description;
	private String genre;
	
	public Movie() {
		
	}
	public Movie(Long ID, String name, String director, String[] cast, String date, String description, String genre) {
		this.ID = ID;
		this.name = name;
		this.director = director;
		this.cast = cast;
		this.date = date;
		this.description = description;
		this.genre = genre;
	}
	
	public void setID(Long ID) {
		this.ID = ID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setCast(String ... cast) {
		this.cast = cast;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Long getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getDirector() {
		return director;
	}
	public String[] getCast() {
		return cast;
	}
	public String getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public String getGenre() {
		return genre;
	}
	
	@Override
	public String toString() {
		return "Movie [ID=" + ID + ", name=" + name + ", director=" + director + ", cast=" + Arrays.toString(cast)
				+ ", date=" + date + ", description=" + description + ", genre=" + genre + "]";
	}
	
	
}
