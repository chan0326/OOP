package service;

import model.AccountDto;

import java.util.List;

public interface AccountService {

    String deposit(AccountDto accountDto);
    String withdraw(AccountDto accountDto);
    String getBalance(String accountNumber);
    String cancelAccount(String accountNumber);

    String createAccount(AccountDto accountDto);
    List<AccountDto> grtAccounts();


}
