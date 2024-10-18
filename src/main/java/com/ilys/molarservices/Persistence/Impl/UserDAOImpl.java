package com.ilys.molarservices.Persistence.Impl;

import com.ilys.molarservices.Controller.DTO.LoginDTO;
import com.ilys.molarservices.Controller.DTO.UserDTO;
import com.ilys.molarservices.Model.Rol;
import com.ilys.molarservices.Model.User;
import com.ilys.molarservices.Persistence.iUserDAO;
import com.ilys.molarservices.Repository.RolRepository;
import com.ilys.molarservices.Repository.UserRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class UserDAOImpl implements iUserDAO {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RolRepository rolRepository;
    //@Autowired
    //private JWTUtil jwtUtil;
    @Override
    public LoginDTO getUserByCredentials(User user) {
        User user1 = userRepository.findUserByEmail(user.getEmail());
        if (user1 == null) {
            return null;
        }
        String passwordHashed = user1.getPassword();
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, user.getPassword())){
            User userResponse = userRepository.findAllByIdAndActive(user1.getId()).get(0);
            return new LoginDTO("",new UserDTO(userResponse));
        }
        return null;
    }

    @Override
    public List<User> getUserDetails(Long id) {
        return List.of();
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User addRole(Long idUser, Long idRole) {
        return null;
    }

    @Override
    public Set<Rol> getRolesByIdUser(Long idUser) {
        return Set.of();
    }
}
