package login.config;

 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import login.repository.LoginRepository;
import login.repository.LoginRepositoryImpl;
import login.services.LoginService;
import login.services.LoginServiceImpl;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
        "login"
})

public class ApplicationConfig {
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public LoginService customerService(){
        return new LoginServiceImpl();
    }

    @Bean
    public LoginRepository customerRepository(){
        return new LoginRepositoryImpl();
    }
    
}