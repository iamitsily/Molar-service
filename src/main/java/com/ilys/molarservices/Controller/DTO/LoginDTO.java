package com.ilys.molarservices.Controller.DTO;

import lombok.Data;

@Data
public class LoginDTO {
    private String token;
    private UserDTO user;

    public LoginDTO(String token, UserDTO user) {
        this.token = token;
        this.user = user;
    }
}
