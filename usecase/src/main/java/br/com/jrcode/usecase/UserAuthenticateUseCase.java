package br.com.jrcode.usecase;

public interface UserAuthenticateUseCase {
    Boolean authenticate(String username, String password);
}
