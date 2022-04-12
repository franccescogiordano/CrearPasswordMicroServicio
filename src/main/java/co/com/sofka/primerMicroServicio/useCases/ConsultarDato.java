package co.com.sofka.primerMicroServicio.useCases;

import co.com.sofka.primerMicroServicio.dtos.PasswordDTO;
import reactor.core.publisher.Flux;


@FunctionalInterface
public interface ConsultarDato {
Flux<PasswordDTO> consultar();

}

