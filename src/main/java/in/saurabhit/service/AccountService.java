package in.saurabhit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.saurabhit.entity.Account;
import in.saurabhit.entity.AccountPK;
import in.saurabhit.repository.AccountRepository;

@Service
public class AccountService {
	
	private AccountRepository accRepo;
	
	public AccountService(AccountRepository accRepo) {
		
		this.accRepo=accRepo;
	}
	
	public void getDataUsingPk() {
		
		
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("SAVING");
		pk.setHolderName("TCS");
		
		Optional<Account> findById = accRepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		
	}
	public void saveAccData() {
		
		AccountPK pk = new AccountPK();
		pk.setAccId(104);
		pk.setAccType("SAVINGS");
		pk.setHolderName("TCS");
		
		Account acc = new Account();
		acc.setBranchName("Bari");
		acc.setMinBal(5000.00);
		acc.setAccPk(pk); // setting pk class object to entity object
		accRepo.save(acc);
	}

}
