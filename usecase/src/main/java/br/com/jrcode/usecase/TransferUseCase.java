package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.Transaction;

public interface TransferUseCase {
    Boolean transfer(Transaction transaction);
}
