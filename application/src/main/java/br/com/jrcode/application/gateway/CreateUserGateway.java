package br.com.jrcode.application.gateway;

import br.com.jrcode.core.domain.TransactionPin;
import br.com.jrcode.core.domain.User;
import br.com.jrcode.core.domain.Wallet;

public interface CreateUserGateway {
    Boolean create(User user, Wallet wallet, TransactionPin transactionPin);
}
