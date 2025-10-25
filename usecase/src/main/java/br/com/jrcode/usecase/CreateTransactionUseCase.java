package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.Transaction;

public interface CreateTransactionUseCase {
    void create(Transaction transaction);
}
