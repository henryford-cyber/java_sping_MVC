package login.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import login.model.User;
import login.repository.LoginRepository;

public class LoginServiceImpl implements LoginService {

    @Autowired
    public LoginRepository loginRepository;

    @Override
    public List<User> findAll() {
        return this.loginRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return this.loginRepository.findById(id);
    }

    @Override
    public void save(User u) {
        this.loginRepository.save(u);
    }
    @Override
    public boolean findUser(User u) {
    	
        return this.loginRepository.findUser(u);
    }

	@Override
	public boolean checkUser(User u) {
		// TODO Auto-generated method stub
		 return this.loginRepository.checkUser(u);
	}
    
  
}