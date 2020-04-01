package ec.utb.WebLibraryProject;

import ec.utb.WebLibraryProject.data.AppUserRepository;
import ec.utb.WebLibraryProject.data.AppUserRoleRepository;
import ec.utb.WebLibraryProject.data.BookRepository;
import ec.utb.WebLibraryProject.data.LoanRepository;
import ec.utb.WebLibraryProject.entity.AppUser;
import ec.utb.WebLibraryProject.entity.AppUserRole;
import ec.utb.WebLibraryProject.entity.Book;
import ec.utb.WebLibraryProject.service.AppUserService;
import ec.utb.WebLibraryProject.service.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.Arrays;

//Author: Benjamin Boson
@Component
public class Seeder implements CommandLineRunner {
    private BookRepository bookRepository;
    private AppUserRepository appUserRepository;
    private LoanRepository loanRepository;
    private AppUserService appUserService;
    AppUserRoleRepository userRoleRepository;

    @Autowired
    public Seeder(BookRepository bookRepository, AppUserRepository appUserRepository, LoanRepository loanRepository, AppUserService appUserService, AppUserRoleRepository userRoleRepository) {
        this.bookRepository = bookRepository;
        this.appUserRepository = appUserRepository;
        this.loanRepository = loanRepository;
        this.appUserService = appUserService;
        this.userRoleRepository = userRoleRepository;
    }



    @Override
    public void run(String... args) throws Exception {
        try {
            userRoleRepository.save(new AppUserRole("ADMIN"));
            userRoleRepository.save(new AppUserRole("USER"));
        }catch (Exception e){
            System.out.println("Roles already initiated");
        }

        try {
            appUserService.registerAppUser("Benjamin","Boson","BenjaminEBoson@Gmail.com","1a1b1c1d", LocalDate.now(), true);
        }catch (Exception e){
            System.out.println("Admin already initiated");
        }
        try{
            bookRepository.save(new Book(90, "War and Peace","George R.R. Martin"));
            bookRepository.save(new Book(150, "A Game of Thrones","George R.R. Martin"));
            bookRepository.save(new Book(60, "Winds of Winter", "George R.R. Martin"));
            bookRepository.save(new Book(150, "The Winter Soldier","George R.R. Martin"));
            bookRepository.save(new Book(90, "A Clash of Kings", "George R.R. Martin"));
        }catch (Exception e){
        System.out.println("Books already initiated");
    }

    }
}
