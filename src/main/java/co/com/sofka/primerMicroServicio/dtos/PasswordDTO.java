package co.com.sofka.primerMicroServicio.dtos;

import javax.validation.constraints.NotBlank;

public class PasswordDTO {
    
    private String id;
    
    @NotBlank
    
    private String password;
    @NotBlank
    private String text;


    public PasswordDTO(String id, String password, String text) {
        this.id = id;
        this.password = password;
        this.text = text;
    }


    public PasswordDTO( String password, String text) {
        this.password = password;
        this.text = text;
    }
    public PasswordDTO() {
   
    }    

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
