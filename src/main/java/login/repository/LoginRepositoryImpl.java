package login.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import login.model.User;
import login.repository.LoginRepository;

public class LoginRepositoryImpl implements LoginRepository {

    private static final Map<Integer, User> users;

    static {
        users = new HashMap<>();
        users.put(1, new User(1,"namphan","123" ));
        users.put(2, new User(2,"admin","123" ));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User findById(int id) {
        User u = users.get(id);
        return u;
    }

    @Override
    public void save(User u) {
        users.put(u.getId(), u);
    }

	@Override
	public boolean findUser(User u) {
		// TODO Auto-generated method stub
		boolean a = false;
		
		for(Map.Entry<Integer, User> item : users.entrySet()) {
			if(item.getValue().getUserName().toString().equals(u.getUserName().toString())
			&& item.getValue().getPassWord().toString().equals(u.getPassWord().toString())) {
			a = true;
			break;
			}
		}
		return a;
	}

	@Override
	public boolean checkUser(User u) {
		// TODO Auto-generated method stub
			boolean a = true;
		
		for(Map.Entry<Integer, User> item : users.entrySet()) {
			if(item.getValue().getUserName().toString().equals(u.getUserName().toString())) {
			a = false;
			break;
			}
		}
		return a;
	}
	
    
}
