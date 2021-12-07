package br.com.projeto.lp2.core.us.user;

import br.com.projeto.lp2.core.domain.User;
import br.com.projeto.lp2.core.ports.driven.repository.UserRepositoryPort;
import br.com.projeto.lp2.core.ports.driver.user.CreateUserPort;
import org.springframework.stereotype.Service;


@Service
public record CreateUserUS(UserRepositoryPort repository)  implements CreateUserPort {

    @Override
    public User apply(User user) {
        return repository.save(user);
    }
}
