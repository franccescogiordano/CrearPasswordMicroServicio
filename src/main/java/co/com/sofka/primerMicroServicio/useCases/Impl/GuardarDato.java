package co.com.sofka.primerMicroServicio.useCases.Impl;




import co.com.sofka.primerMicroServicio.dtos.PasswordDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface GuardarDato {
    public Mono<String> apply(PasswordDTO datoDTO);
}