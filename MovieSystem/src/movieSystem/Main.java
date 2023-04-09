package movieSystem;

public class Main {

	public static void main(String[] args) {
		
		
		Movie movie1 = new Movie(1, "Marvelous Mrs. Maisel", "Amy Sherman-Palladino", 
				new String[] {"Rachel Brosnahan", "Alex Borstein", "Michael Zegen", "Marin Hinkle", "Tony Shalhoub"}, 
				"2017", "a New York housewife who discovers she has a knack for stand-up comedy and pursues a career in it.", "comedy");
		Movie movie2 = new Movie(2, "Suits", "Dan Stoloff", 
				new String[] {"Gabriel Macht", "Patrick J. Adams", "Rick Hoffman", "Meghan Markle", "Sarah Rafferty"}, 
				"2011", "Suits focuses on Harvey and Mike winning lawsuits and closing cases, while at the same time hiding Mike's secret.", "legal drama");
		
//		System.out.println(movie1.toString());
//		System.out.println(movie2.toString());
		MovieManager mm = new MovieManager();
		mm.addMovie(movie1);
		mm.addMovie(movie2);
		System.out.println("***************MOVIES********************");
		System.out.println(mm.getMovies());
		mm.deleteMovie(1);
		System.out.println("movie deleted");
		System.out.println(mm.getMovies());
		
		
		User user1 = new User(1, "banu pekel", "1", "bp@gmail.com");
		User user2 = new User(2, "rana pekel", "1", "rp@gmail.com");
		
		UserManager um = new UserManager();
		um.addUser(user2);
		um.addUser(user1);
		System.out.println("***************USERS********************");
		System.out.println(um.getUsers());
		um.deleteUser(1);
		System.out.println("user deleted");
		System.out.println(um.getUsers());
		
//		System.out.println(user1.toString());
//		System.out.println(user2.toString());

		
		

		
	}

}
