package co.com.sofka.primerMicroServicio.useCases.Impl;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import co.com.sofka.primerMicroServicio.dtos.PasswordDTO;
import co.com.sofka.primerMicroServicio.mapper.MapperUtils;
import co.com.sofka.primerMicroServicio.repository.PasswordRepository;
import co.com.sofka.primerMicroServicio.useCases.ConsultarDato;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Supplier;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Validated
public class ConsultarDatoImpl implements Supplier<Flux<PasswordDTO>> {
    private final PasswordRepository repositorioRecurso;
    private final MapperUtils mapper;
    public ConsultarDatoImpl(PasswordRepository repositorioRecurso, MapperUtils mapper) {
        this.repositorioRecurso = repositorioRecurso;
        this.mapper = mapper;
    
    }



    @Override
    public Flux<PasswordDTO> get() {
        return this.repositorioRecurso.findAll().map(mapper.mapDatoToDTO());
    }

 
}
