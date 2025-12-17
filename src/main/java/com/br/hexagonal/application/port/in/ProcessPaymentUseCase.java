package com.br.hexagonal.application.port.in;

import com.br.hexagonal.application.domain.Payment;
import com.br.hexagonal.application.domain.PaymentResult;

public interface ProcessPaymentUseCase {

    PaymentResult process(Payment payment);

}
