package ec.utb.WebLibraryProject.data;

import ec.utb.WebLibraryProject.entity.Loan;
import org.springframework.data.repository.CrudRepository;

//Author: Benjamin Boson
public interface LoanRepository extends CrudRepository<Loan, Integer> {
}
