package co.com.sofka.primerMicroServicio.useCases.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import co.com.sofka.primerMicroServicio.dtos.PasswordDTO;
import co.com.sofka.primerMicroServicio.mapper.MapperUtils;
import co.com.sofka.primerMicroServicio.models.Password;
import co.com.sofka.primerMicroServicio.repository.PasswordRepository;
import reactor.core.publisher.Mono;

@Service
@Validated
public class ImplCrearPasswordUseCase implements GuardarDato {
    private final PasswordRepository repositorio;
    private final MapperUtils mapperUtils;
    @Autowired
    public ImplCrearPasswordUseCase(MapperUtils mapperUtils, PasswordRepository repositorio) {
        this.repositorio = repositorio;
        this.mapperUtils = mapperUtils;
    }

    @Override
    public Mono<String> apply(PasswordDTO datoDTO) {
        return repositorio.save(mapperUtils.mapperToDato(null).apply(datoDTO)).map(Password::getId).thenReturn(datoDTO.toString());
    }
}