package service;

import model.AccountDto;

import java.util.List;

public interface AccountService {

    String deposit(AccountDto accountDto);
    String withdraw(AccountDto accountDto);
    List<AccountDto> getBalance(String accountNumber);
    String cancelAccount(String accountNumber);

    String createAccount(AccountDto accountDto);
}
