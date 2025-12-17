package com.br.hexagonal.application.service;

import com.br.hexagonal.application.domain.Payment;
import com.br.hexagonal.application.domain.PaymentResult;
import com.br.hexagonal.application.port.in.ProcessPaymentUseCase;
import com.br.hexagonal.application.port.out.PaymentStrategy;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PaymentService implements ProcessPaymentUseCase {

    private final List<PaymentStrategy> strategies;

    @Override
    public PaymentResult process(Payment payment) {
        return strategies.stream()
                .filter(strategy -> strategy.supports(payment))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Método de pagamento não suportado"))
                .process(payment);
    }

}
