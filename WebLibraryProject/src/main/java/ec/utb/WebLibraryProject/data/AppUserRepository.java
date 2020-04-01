package ec.utb.WebLibraryProject.data;

import ec.utb.WebLibraryProject.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Author: Rijad Hamula
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
    Optional<AppUser> findByEmailIgnoreCase(String email);
    //Optional<AppUser> findAppUserBy (String firstname, String lastname,String email);
    List<AppUser> findAll();
}
