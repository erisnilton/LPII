package br.com.projeto.lp2.core.ports.driver;

import br.com.projeto.lp2.core.domain.User;

public interface CreateUserPort {
    User apply(User user);
}