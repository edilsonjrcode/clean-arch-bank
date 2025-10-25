package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.User;
import br.com.jrcode.core.exception.EmailException;
import br.com.jrcode.core.exception.TaxNumberException;

public interface CreateUserUseCase {
    void create(User user) throws TaxNumberException, EmailException;
}
