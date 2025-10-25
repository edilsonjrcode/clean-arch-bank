package br.com.jrcode.application.usecaseimpl;

import br.com.jrcode.application.gateway.EmailAvailableGateway;
import br.com.jrcode.usecase.EmailAvailableUseCase;

public class EmailAvailableUseCaseImpl implements EmailAvailableUseCase {

    private EmailAvailableGateway emailAvailableGateway;

    public EmailAvailableUseCaseImpl(EmailAvailableGateway emailAvailableGateway) {
        this.emailAvailableGateway = emailAvailableGateway;
    }

    @Override
    public Boolean emailAvailable(String email) {
        return emailAvailableGateway.emailAvailable(email);
    }
}
