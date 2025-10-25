package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.Transaction;

public interface TransactionValidateUseCase {
    Boolean validate(Transaction transaction);
}
