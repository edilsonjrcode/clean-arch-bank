package br.com.jrcode.usecase;

import br.com.jrcode.core.domain.TaxNumber;

public interface TaxNumberAvailableUseCase {
    Boolean taxNumberAvilable(String taxNumber);
}
