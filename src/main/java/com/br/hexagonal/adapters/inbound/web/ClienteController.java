package com.br.hexagonal.adapters.inbound.web;

import com.br.hexagonal.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrar() {
        clienteService.cadastrarCliente();
    }

    @GetMapping
    public void consultar() {
        clienteService.buscarCliente();
    }

    @PutMapping
    public void atualizar() {
        clienteService.atualizarCliente();
    }
}
