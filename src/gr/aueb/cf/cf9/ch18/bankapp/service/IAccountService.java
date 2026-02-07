package gr.aueb.cf.cf9.ch18.bankapp.service;

import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountWithdrawDTO;
import gr.aueb.cf.cf9.ch18.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.core.exceptions.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {
    AccountReadOnlyDTO createNewAccount(AccountInsertDTO insertDTO);
    void deposit(AccountDepositDTO depositDTO) throws AccountNotFoundException;
    void withdraw(AccountWithdrawDTO withdrawDTO) throws InsufficientBalanceException, AccountNotFoundException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
}
