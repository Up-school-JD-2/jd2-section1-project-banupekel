package movieSystem;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

	private List<User> users;
	
	public UserManager() {
		this.users = new ArrayList<>();
	}
	
	private User user1 = new User(1L, "banu pekel", "bp@gmail.com", "1");
	private User user2 = new User(2L, "rana pekel", "rp@gmail.com", "1");
	
	public void initializeUsers() {
		users.add(user1);
		users.add(user2);
	}
	public void printUsers() {
		for(User user : users) {
			System.out.println(user);
		}
	}
	public void addUser(User user) {
		users.add(user);
	}
	public void removeUserByName(String userName) {
		for(User user : users) {
			if(user.getName().equalsIgnoreCase(userName)) {
				users.remove(user);
				break;
			}
		}
	}
	public User searchUserByName(String userName) {
		User searchedUser = null;
		for(User user : users) {
			if(user.getName().equalsIgnoreCase(userName)) {
				searchedUser = user;
			}
		}
		return searchedUser;
	}
	
	
	@Override
	public String toString() {
		return "UserManager [users=" + users + "]";
	}
	
}
