package com.br.hexagonal;

import com.br.hexagonal.application.port.in.ProcessPaymentUseCase;
import com.br.hexagonal.application.port.out.PaymentStrategy;
import com.br.hexagonal.application.service.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}


	@Bean
	ProcessPaymentUseCase processPaymentUseCase(
			List<PaymentStrategy> strategies
	) {
		return new PaymentService(strategies);
	}

}
