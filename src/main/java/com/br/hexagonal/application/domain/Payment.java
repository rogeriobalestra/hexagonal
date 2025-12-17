package com.br.hexagonal.application.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Payment {

    private final BigDecimal amount;
    private final String method; // ex: "PIX", "BOLETO", "CREDIT_CARD"
}
