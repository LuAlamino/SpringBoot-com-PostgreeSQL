package DIO.Aula.Spring.repository;

import DIO.Aula.Spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  UserRepository extends JpaRepository<User, Integer> {
}
