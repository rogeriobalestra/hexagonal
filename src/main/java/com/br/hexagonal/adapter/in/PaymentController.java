package com.br.hexagonal.adapter.in;


import com.br.hexagonal.application.domain.Payment;
import com.br.hexagonal.application.domain.PaymentResult;
import com.br.hexagonal.application.port.in.ProcessPaymentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final ProcessPaymentUseCase useCase;

    @PostMapping
    public PaymentResult pay(@RequestBody Payment payment){
        return useCase.process(payment);
    }
}
