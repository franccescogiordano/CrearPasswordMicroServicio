package co.com.sofka.primerMicroServicio.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "passwords")
public class Password {
    @Id
    private String id = UUID.randomUUID().toString().substring(0,6);

    private String password;
    private String text;



    public Password(String password, String text) {
        this.password = password;
        this.text = text;
    }
    public Password() {
     
    }

    public String getPassword() {
        return password;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    
}
