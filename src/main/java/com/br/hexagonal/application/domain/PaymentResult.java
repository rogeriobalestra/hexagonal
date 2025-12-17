package com.br.hexagonal.application.domain;

public record PaymentResult(
        boolean success,
        String message
) {}