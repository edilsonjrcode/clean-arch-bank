package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.Transaction;

public interface UserNotificationUseCase {
    Boolean notificate(Transaction transaction, String email);
}
