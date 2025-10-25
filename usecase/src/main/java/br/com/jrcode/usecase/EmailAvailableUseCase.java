package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.Transaction;

public interface EmailAvailableUseCase {
    Boolean emailAvailable(String email);
}
