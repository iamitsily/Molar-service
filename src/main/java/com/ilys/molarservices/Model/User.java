package com.ilys.molarservices.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "registration", length = 15, nullable = false)
    private String registration;
    @Column(name = "name", length = 30, nullable = false)
    private String name;
    @Column(name = "lastName", length = 30, nullable = false)
    private String lastName;
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    @Column(name = "phoneNumber", length = 15, nullable = false)
    private String phoneNumber;
    @Column(name = "sex", length = 3, nullable = false)
    private String sex;
    @Column(name = "password", length = 120, nullable = false)
    private String password;
    @Column(name = "active", length = 1, nullable = false)
    private Integer active;
    @Column(name = "tolerance", length = 1, nullable = false)
    private Integer tolerance;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_rol")
    )
    private Set<Rol> user_roles = new HashSet<>();
}
