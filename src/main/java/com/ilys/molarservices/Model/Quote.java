package com.ilys.molarservices.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "day", length = 20, nullable = false)
    private String day;
    @Column(name = "hour", length = 20, nullable = false)
    private String hour;
    @Column(name = "motive", length = 100, nullable = false)
    private String motive;
    @Column(name = "description", length = 120, nullable = false)
    private String description;
    @Column(name = "motiveChange", length = 120, nullable = false)
    private String motiveChange;
    @Column(name = "state", length = 1, nullable = false)
    private String state;
    @Column(name = "active", length = 1, nullable = false)
    private String active;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;
}
