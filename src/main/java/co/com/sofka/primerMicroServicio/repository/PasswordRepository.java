package co.com.sofka.primerMicroServicio.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import co.com.sofka.primerMicroServicio.models.Password;
public interface PasswordRepository extends ReactiveMongoRepository<Password,String>{
    
    
}
