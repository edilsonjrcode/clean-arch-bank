package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.User;

public interface FindUserByTaxNumberUseCase {
    User findByTaxNumber(String taxNumber);
}
