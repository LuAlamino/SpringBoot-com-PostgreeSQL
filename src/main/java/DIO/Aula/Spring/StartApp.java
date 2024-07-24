package DIO.Aula.Spring;

import DIO.Aula.Spring.model.User;
import DIO.Aula.Spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("AlaminoVideo");
        user.setUserName("Lucas3");
        user.setPassword("Teste123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }


    }
}
