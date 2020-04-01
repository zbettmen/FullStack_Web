package ec.utb.WebLibraryProject.entity;

import javax.persistence.*;
import java.util.Objects;

//Author: Benjamin Boson & Lukas Rasmussen
@Entity
public class AppUserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;
    @Column(unique = true)
    private String role;

    public AppUserRole(String role) {
        this.role = role;
    }

    public AppUserRole(){}

    public int getRoleId() {
        return roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUserRole appRole = (AppUserRole) o;
        return roleId == appRole.roleId &&
                Objects.equals(role, appRole.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, role);
    }

    @Override
    public String toString() {
        return "AppRole{" +
                "roleId=" + roleId +
                ", role='" + role + '\'' +
                '}';
    }
}
