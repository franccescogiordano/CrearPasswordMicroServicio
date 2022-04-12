package co.com.sofka.primerMicroServicio.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import co.com.sofka.primerMicroServicio.dtos.PasswordDTO;
import co.com.sofka.primerMicroServicio.useCases.Impl.ImplCrearPasswordUseCase;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
@Configuration
public class CrearPasswordRouter {
    @Bean
    public RouterFunction<ServerResponse> createQuestion(ImplCrearPasswordUseCase useCaseCrear) {
        return route(POST("/crear").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PasswordDTO.class)
                        .flatMap(questionDTO -> useCaseCrear.apply(questionDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.TEXT_PLAIN)
                                        .bodyValue(result))
                        )
        );
}
