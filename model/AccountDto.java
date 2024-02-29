package model;

import java.util.Date;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AccountDto {
    private long id;


    private String accountNumber;


    private String accountHolder;

    private double balance;


    private Date transactionDate;
}
