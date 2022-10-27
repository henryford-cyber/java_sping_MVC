package login.repository;

import java.util.List;

import login.model.User;



public interface LoginRepository {
	  List<User> findAll();

	  User findById(int id);

	    void save(User u);
	    
	    boolean findUser(User u);
	    boolean checkUser(User u);
}
