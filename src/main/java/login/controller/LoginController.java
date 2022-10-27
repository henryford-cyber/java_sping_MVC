package login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import login.model.User;
import login.services.LoginService;

@Controller
public class LoginController {
	@Autowired
    public LoginService loginService;

    @GetMapping("/users")
    public ModelAndView list(){
        List<User> u = this.loginService.findAll();
        ModelAndView modelAndView = new ModelAndView("user/list");
        modelAndView.addObject("users", u);
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("user/create");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/new")
    public ModelAndView createUser(@ModelAttribute("user") User u){
        int randomId = (int)(Math.random() * 10000);
        u.setId(randomId);//For demo purpose only

        this.loginService.save(u);

        ModelAndView modelAndView = new ModelAndView("user/create");
        modelAndView.addObject("user", new User());
        modelAndView.addObject("message", "New Customer was created");
        return modelAndView;
    }

    @GetMapping(value = "/view")
    public ModelAndView view(@RequestParam("id") Integer userId){
        User u = this.loginService.findById(userId);
        ModelAndView modelAndView = new ModelAndView("user/view");
        modelAndView.addObject("user", u);
        return modelAndView;
    }
	  @GetMapping({"/","/login"}) 
	  public ModelAndView login(){
	  ModelAndView modelAndView = new ModelAndView("user/login");
      modelAndView.addObject("user", new User());
      return modelAndView;
	  }
	  @PostMapping(value = "/login") 
	  public ModelAndView check(@ModelAttribute("user") User u){
		  ModelAndView modelAndView = new ModelAndView("user/loginsuccess");
		boolean check = this.loginService.findUser(u);
		  if(check == true) {
			  return modelAndView;
		  }else {
			  modelAndView = new ModelAndView("user/login");
		        modelAndView.addObject("user", new User());
		        modelAndView.addObject("message", "tai khoan hoac mat khau khong dung !!");
			  return modelAndView;
		  }
	  }
	  
	  
	 
}
