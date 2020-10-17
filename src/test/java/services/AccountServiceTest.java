package services;

import domains.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {
    AccountService accountService = new AccountService();
    @Test
    void signUp()
    {
        Account createAccount = accountService.signUp("amin","brg","amin","amin","7617");
        Assertions.assertEquals("amin",createAccount.getName());
    }
}