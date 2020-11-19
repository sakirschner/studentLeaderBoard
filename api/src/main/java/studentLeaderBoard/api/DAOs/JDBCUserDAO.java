package studentLeaderBoard.api.DAOs;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import studentLeaderBoard.api.models.User;

@Component
public class JDBCUserDAO implements UserDAO{
	
	private JdbcTemplate jdbc;
	
	public JDBCUserDAO(DataSource dataSource) {
		jdbc = new JdbcTemplate(dataSource);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> allUsers = new ArrayList<>();
		String sql = "SELECT * FROM users;";
		SqlRowSet results = jdbc.queryForRowSet(sql);
		while(results.next()) {
			User retrievedUser = mapRowToUser(results);
			allUsers.add(retrievedUser);
		}
		return allUsers;
	}
	
	@Override
	public User getUserById(int id) {
		User user = new User();
		String sql = "SELECT * FROM users WHERE id = ?;";
		SqlRowSet result = jdbc.queryForRowSet(sql, id);
		if (result.next()) {
			user = mapRowToUser(result);
		}
		return user;
	}
	
	private User mapRowToUser(SqlRowSet results) {
		User retrievedUser = new User();
		retrievedUser.setId(results.getInt("id"));
		retrievedUser.setEmail(results.getString("email"));
		retrievedUser.setPassword(results.getString("password"));
		retrievedUser.setFirstName(results.getString("firstName"));
		retrievedUser.setLastName(results.getString("lastName"));
		retrievedUser.setType(results.getString("type"));
		retrievedUser.setAvatar(results.getString("avatar"));
		retrievedUser.setLevel(results.getInt("level"));
		return retrievedUser;
	}

}
