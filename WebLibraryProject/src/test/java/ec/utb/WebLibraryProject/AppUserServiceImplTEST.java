package ec.utb.WebLibraryProject;


import ec.utb.WebLibraryProject.entity.AppUser;
import ec.utb.WebLibraryProject.service.AppUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AppUserServiceImplTEST {


    @Autowired
    private AppUserService appUserService;


    @Test
    public void test1(){
       String firstName = "Test";
       String lastName = "Testsson";
       String email = "test@gmail.com";
       String password = "1234";

       AppUser appUser = appUserService.registerAppUser(firstName,lastName,email,password, LocalDate.now(),true);
       assertNotNull(appUser);
       assertEquals(2,appUser.getAppUserId());
       assertEquals("Test",appUser.getFirstName());
       assertEquals("Testsson",appUser.getLastName());
       assertEquals("test@gmail.com",appUser.getEmail());

    }

    @Test
    public void findById(){
        int idFind = 1;

       AppUser appUser = appUserService.findById(idFind);
       assertNotNull(appUser);
       assertEquals(1,appUser.getAppUserId());

    }







}
