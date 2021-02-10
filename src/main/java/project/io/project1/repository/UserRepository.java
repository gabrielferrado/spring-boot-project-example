package project.io.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.io.project1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
