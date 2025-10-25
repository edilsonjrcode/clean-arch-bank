package br.com.jrcode.application.usecaseimpl;

import br.com.jrcode.application.gateway.TaxNumberAvailableGateway;
import br.com.jrcode.usecase.TaxNumberAvailableUseCase;

public class TaxNumberAvailableUseCaseImpl implements TaxNumberAvailableUseCase {

    private TaxNumberAvailableGateway taxNumberAvailableGateway;

    public TaxNumberAvailableUseCaseImpl(TaxNumberAvailableGateway taxNumberAvailableGateway) {
        this.taxNumberAvailableGateway = taxNumberAvailableGateway;
    }

    @Override
    public Boolean taxNumberAvailable(String taxNumber) {
        return taxNumberAvailableGateway.taxNumberAvailable(taxNumber);
    }
}
