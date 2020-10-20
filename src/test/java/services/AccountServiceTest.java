package services;

import domains.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repositories.AccountRepositoryDAO;

class AccountServiceTest {


    @Test
    public  void signUp() {
        AccountService accountService = new AccountService();
        Account account = accountService.signUp("reza6" , "reza6" ,"reza6" ,"reza6" ,"reza6");
        Assertions.assertNotNull(account);
    }

    @Test
    void selectByUserNameAndPassword() {
    }

    @Test
    void findByUserName() {
    }

    @Test
    void deleteAccount() {
    }

    @Test
    void editAccount() {
    }
}