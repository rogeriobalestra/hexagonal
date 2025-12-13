package com.br.hexagonal.external;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MySQLCliente {

    public void inserirDados(){
        log.info("gravando cliente");
    }

    public void consultarDados() {
        log.info("Consultando cliente");
    }

    public void atualizarDados(){
        log.info("Consultando cliente");
    }

    public void consultssrDados(){
        log.info("Consultando cliente");
    }

}
