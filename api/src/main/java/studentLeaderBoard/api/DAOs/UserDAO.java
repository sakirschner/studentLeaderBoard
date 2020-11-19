package studentLeaderBoard.api.DAOs;

import java.util.List;

import studentLeaderBoard.api.models.User;

public interface UserDAO {
	
	public List<User> getAllUsers();
	
	public User getUserById(int id);

}
