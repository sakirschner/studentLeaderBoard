package studentLeaderBoard.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import studentLeaderBoard.api.DAOs.UserDAO;
import studentLeaderBoard.api.models.User;

@RestController 
@CrossOrigin
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@GetMapping("/user")
	public List<User> getAllUsers() {
		List<User> allUsers = userDAO.getAllUsers();
		return allUsers;
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		User user = userDAO.getUserById(id);
		return user;
	}
	
}
