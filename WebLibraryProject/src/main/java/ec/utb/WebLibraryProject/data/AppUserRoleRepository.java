package ec.utb.WebLibraryProject.data;

import ec.utb.WebLibraryProject.entity.AppUserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

//Author: Benjamin Boson
public interface AppUserRoleRepository extends CrudRepository<AppUserRole, Integer> {
    @Query("SELECT r FROM AppUserRole r WHERE UPPER(r.role) = UPPER(:role)")
    Optional<AppUserRole> findByRole(@Param("role") String role);
}
