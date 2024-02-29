package controller;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;
import serviceimpl.AcoountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Accountcontroller {
     AccountService as ;

    public Accountcontroller() {
        this.as = AcoountServiceImpl.getInstance();
    }



    public String createAccount(Scanner sc) {
        System.out.println("생성할 계좌번호의 생성자명을 입력하세요");
        System.out.println("생성할 계좌번호를 입력하세요");
        return as.createAccount(new AccountBuilder()
                        .id(sc.nextLong())
                .accountHolder(sc.next())
                .accountNumber(sc.next())
                        .balance(sc.nextDouble())
                        .transactionDate(null)
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("인출한 계좌의 생성자명을 입력하세요");
        System.out.println("인출할 금액을 입력하세요");
        return as.deposit(new AccountBuilder()
                .id(sc.nextLong())
                .accountHolder(sc.next())
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String withdraw(Scanner sc) {
        return as.withdraw(new AccountBuilder()
                .id(sc.nextLong())
                .accountHolder(sc.next())
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(null)
                .build());
    }
    public String getBalance(Scanner sc) {
        return as.getBalance(sc.next());    }

    public String cancelAccount(Scanner sc) {
        return as.cancelAccount(sc.next());
    }


    public List<AccountDto> grtAccounts() {
        return null;
    }
}
