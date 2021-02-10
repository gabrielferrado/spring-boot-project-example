package project.io.project1.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import project.io.project1.entity.User;
import project.io.project1.repository.UserRepository;

import java.util.List;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

  private final UserRepository userRepository;

  public DataInitializr(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public void onApplicationEvent(ContextRefreshedEvent arg0) {
    List<User> users = userRepository.findAll();

    if (users.isEmpty()) {
      createUser("Gabriel Ferreira", "gabriel@email.com");
      createUser("Jayara Medeiros", "jayara@email.com");
      createUser("Dona Maria", "maria@email.com");
    }
  }

  private void createUser(String name, String email) {
    User user = new User(name, email);
    userRepository.save(user);
  }
}
