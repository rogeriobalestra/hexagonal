package com.br.hexagonal.infrastructure.adapter.mysql;

import com.br.hexagonal.domain.cliente.port.ClienteRepositoryPort;
import com.br.hexagonal.external.MySQLCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class MySQLClientAdapter  implements ClienteRepositoryPort {

    private final MySQLCliente mySQLCliente;

    @Override
    public void inserir() {
        mySQLCliente.inserirDados();
    }

    @Override
    public void consultar() {
        mySQLCliente.consultssrDados();
    }

    @Override
    public void atualizar() {
        mySQLCliente.atualizarDados();
    }
}
