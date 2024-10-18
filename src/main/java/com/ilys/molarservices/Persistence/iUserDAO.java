package com.ilys.molarservices.Persistence;

import com.ilys.molarservices.Controller.DTO.LoginDTO;
import com.ilys.molarservices.Model.Rol;
import com.ilys.molarservices.Model.User;

import java.util.List;
import java.util.Set;

public interface iUserDAO {

    //Auth
    LoginDTO getUserByCredentials(User user);
    List<User> getUserDetails(Long id);
    User getUserByEmail(String email);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

    //Rol
    User addRole(Long idUser, Long idRole);
    Set<Rol> getRolesByIdUser(Long idUser);
}
