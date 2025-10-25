package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.User;
import br.com.jrcode.core.exception.EmailException;
import br.com.jrcode.core.exception.InternalServerErrorException;
import br.com.jrcode.core.exception.TaxNumberException;
import br.com.jrcode.core.exception.TransactionPinException;

public interface CreateUserUseCase {
    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException;
}
