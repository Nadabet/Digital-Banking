package ma.enset.digitalbanking.repositories;

import ma.enset.digitalbanking.Entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
