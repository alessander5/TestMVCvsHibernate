package com.springapp.mvc.domein;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Infy on 09.03.2016.
 */
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String role;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Authorization> authorizationSet;

    public Role() {
    }

    public Role(int id, String role) {
        this.id = id;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Authorization> getAuthorizationSet() {
        return authorizationSet;
    }

    public void setAuthorizationSet(Set<Authorization> authorizationSet) {
        this.authorizationSet = authorizationSet;
    }

}
