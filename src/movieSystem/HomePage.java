package movieSystem;

import java.util.Scanner;

public class HomePage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MovieManager mm = new MovieManager();
		UserManager um = new UserManager();
		
		mm.initializeMovies();
		um.initializeUsers();
		
		int choice = 0;
		printMenu();
		
		do {
			System.out.println("your choice");
			choice = scanner.nextInt();
			switch(choice) {
			case 1 -> {
				System.out.println("******************************");
				um.printUsers();
				System.out.println("******************************");
			}
			case 2 -> {
				System.out.println("******************************");
				System.out.println("please enter user id");
				Long ID = scanner.nextLong();
				System.out.println("please enter user name");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("please enter your email");
				String email = scanner.nextLine();
				System.out.println("please enter your password");
				String password = scanner.nextLine();
				User user = new User(ID,name,email,password);
				um.addUser(user);
				System.out.println("******************************");
			}
			case 3 -> {
				System.out.println("******************************");
				System.out.println("please enter user name");
				scanner.nextLine();
				String name = scanner.nextLine();
				um.removeUserByName(name);
				System.out.println("******************************");
			}
			case 4 -> {
				System.out.println("******************************");
				System.out.println("please enter user name");
				scanner.nextLine();
				String name = scanner.nextLine();
				User user = um.searchUserByName(name);
				System.out.println(user);
				System.out.println("******************************");
			}
			case 5 -> {
				System.out.println("******************************");
				mm.printMovies();
				System.out.println("******************************");
			}
			case 6 -> {
				System.out.println("******************************");
				System.out.println("please enter movie id");
				Long ID = scanner.nextLong();
				System.out.println("please enter movie name");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("please enter movie director");
				String director = scanner.nextLine();
				System.out.println("plese enter 5 cast names after each name press enter");
				String[] cast = new String[5];
				for(int i = 0; i < 5; i++) {
					cast[i] = scanner.nextLine();
				}
				System.out.println("please enter movie date");
				String date = scanner.nextLine();
				System.out.println("please enter movie description");
				String description = scanner.nextLine();
				System.out.println("please enter movie genre");
				String genre = scanner.nextLine();
				Movie movie = new Movie(ID,name,director,cast,date,description,genre);
				mm.addMovie(movie);
				System.out.println("******************************");
				
			}
			case 7 -> {
				System.out.println("******************************");
				System.out.println("please enter movie name");
				scanner.nextLine();
				String name = scanner.nextLine();
				mm.removeMovieByName(name);
				System.out.println("******************************");
			}
			case 8 -> {
				System.out.println("******************************");
				System.out.println("please enter movie name");
				scanner.nextLine();
				String name = scanner.nextLine();
				Movie movie = mm.searchMovieByName(name);
				System.out.println(movie);
				System.out.println("******************************");
			}
			case -1 -> {
				System.out.println("have a nice day");
			}
			default -> printMenu();
			}
		}while(choice != -1);

	}
	
	private static void printMenu() {
		System.out.println("**** Menu ****");
		System.out.println("1: print users");
		System.out.println("2: add user");
		System.out.println("3: remove user by name");
		System.out.println("4: search user by name");
		System.out.println("5: print movies");
		System.out.println("6: add movie");
		System.out.println("7: remove movie by name");
		System.out.println("8: search movie by name");
		System.out.println("-1: logout \n\n");
	}

}
