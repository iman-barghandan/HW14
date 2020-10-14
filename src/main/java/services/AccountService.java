package services;

import domains.Account;
import domains.Post;
import repositories.AccountRepositoryDAO;

import java.util.Date;

public class AccountService {
    AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();

    public Account signUp(String name, String lastName , String username , String password, String phoneNumber) {
        Account account = new Account();
        account.setName(name);
        account.setLastName(lastName);
        account.setUsername(username);
        account.setPassword(password);
        account.setPhoneNumber(phoneNumber);
        account.setCreateDate(new Date());


        accountRepositoryDAO.save(account);
        return account;
    }
}
