package com.bridgelabz;

import com.bridgelabz.JUnit.BankAccountTest.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp(){
        account=new BankAccount(1000);
    }

    @Test
    public void shouldAddMoney(){
        account.deposit(2000);
        Assertions.assertEquals(3000, account.getBalance());
    }


    @Test
    public void shouldWithdraw(){
        boolean possible=account.withdraw(700);
        Assertions.assertTrue(possible);
        Assertions.assertEquals(300, account.getBalance());

    }

    @Test
    public void shouldWithdrawalFail(){
        boolean possible=account.withdraw(1700);
        Assertions.assertFalse(possible);
        Assertions.assertEquals(1000, account.getBalance());
    }
}
