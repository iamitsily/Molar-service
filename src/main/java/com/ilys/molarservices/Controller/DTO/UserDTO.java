package com.ilys.molarservices.Controller.DTO;

import com.ilys.molarservices.Model.Rol;
import com.ilys.molarservices.Model.User;
import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String registration;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String sex;
    private String password;
    private Integer active;
    private Integer tolerance;
    private Set<Rol> user_roles;

    public UserDTO(User user) {
        this.id = user.getId();
        this.registration = user.getRegistration();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phoneNumber = user.getPhoneNumber();
        this.sex = user.getSex();
        this.password = user.getPassword();
        this.active = user.getActive();
        this.tolerance = user.getTolerance();
        this.user_roles = user.getUser_roles();
    }

    public UserDTO(Long id, String registration, String name, String lastName, String email, String password, String sex, Integer active, Integer tolerance) {
        this.id = id;
        this.registration = registration;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.active = active;
        this.tolerance = tolerance;
    }
}
