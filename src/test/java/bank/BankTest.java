package bank;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.iesvdm.bank.Bank;
import org.iesvdm.bank.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

	private Bank bank;

	// the collaborator of Bank that we manually instrument and inspect
	private List<BankAccount> bankAccounts;

	@BeforeEach
	public void setup() {

	}

	@Test
	public void whenOpenNewAccountdReturnAPositiveIdAndStoreTheAccount() {

	}

	@Test
	public void whenDepositAccountIsNotFoundThrowException() {

	}

	@Test
	public void whenDepositAccountIsFoundIncrementBalance() {

	}

	@Test
	public void whenWithdrawAccountIsNotFoundThrowException() {

	}

	@Test
	public void whenWithdrawAccountIsFoundDecrementBalance() {

	}

	@Test
	public void whenTaxesAccountIsFoundDecrementBalance() {

	}

	@Test
	public void whenTaxesAccountIsNotFoundThrowException() {

	}

}
