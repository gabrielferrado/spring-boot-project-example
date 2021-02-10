package project.io.project1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import project.io.project1.repository.UserRepository;

@Controller
public class UserController {
  private final UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("/")
  public String getUsers(Model model) {
    model.addAttribute("users", this.userRepository.findAll());
    return "user";
  }
}
