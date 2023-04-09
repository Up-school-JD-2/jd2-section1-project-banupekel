package movieSystem;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

	 private List<User> users;

	    public UserManager() {
	        this.users = new ArrayList<>();
	    }

	    
	    public List<User> getUsers() {
			return users;
		}


		public void setUsers(List<User> users) {
			this.users = users;
		}


		public void addUser(User user) {
	        users.add(user);
	    }

	    public void deleteUser(int id) {
	        for (User user : users) {
	            if (user.getId() == id) {
	                users.remove(user);
	                return;
	            }
	        }
	    }
}
