package in.saurabhit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.saurabhit.entity.Account;
import in.saurabhit.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{

}
