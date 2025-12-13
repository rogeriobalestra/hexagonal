package com.br.hexagonal.application.service;

import com.br.hexagonal.domain.cliente.port.ClienteRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepositoryPort clienteRepositoryPort;

    public void cadastrarCliente() {
        clienteRepositoryPort.inserir();
    }

    public void buscarCliente() {
        clienteRepositoryPort.consultar();
    }

    public void atualizarCliente(){
        clienteRepositoryPort.atualizar();
    }

}
