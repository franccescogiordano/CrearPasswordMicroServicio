package co.com.sofka.primerMicroServicio.mapper;



import java.util.function.Function;
import org.springframework.stereotype.Component;

import co.com.sofka.primerMicroServicio.models.Password;
import co.com.sofka.primerMicroServicio.dtos.PasswordDTO;
@Component
public class MapperUtils {


    public Function<PasswordDTO, Password> mapperToDato(String id) {
        return updateDato -> {
            Password dato = new Password();
            dato.setId(id);
            dato.setText(updateDato.getText());
            dato.setPassword(updateDato.getPassword());
            return dato;
        };
    }

    public Function<Password, PasswordDTO> mapDatoToDTO() {
        return entity -> new PasswordDTO(
                entity.getId(),
                entity.getPassword(),
                entity.getText()
        );
    }

}