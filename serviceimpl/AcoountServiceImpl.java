package serviceimpl;

import model.AccountDto;
import service.AccountService;
import service.GradeService;

import java.util.ArrayList;
import java.util.List;

public class AcoountServiceImpl implements AccountService  {
    private  static AccountService instance = new AcoountServiceImpl();

    List<AccountDto> list ;

    private AcoountServiceImpl(){
        this.list = new ArrayList<>();;
    }
    public static AccountService getInstance(){
        return instance;
    }




    public String createAccount( AccountDto accountDto ) {
        list.add(accountDto);
        System.out.println("계좌 생성 성공");
        System.out.println(accountDto);
        System.out.println(list);
        return "";

    }

    @Override
    public List<AccountDto> grtAccounts() {
        return null;
    }

    @Override
    public String deposit(AccountDto accountDto) {

//        if (){}
        return "";

    }

    @Override
    public String withdraw(AccountDto accountDto) {
        return "";

    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return "";

    }
}
