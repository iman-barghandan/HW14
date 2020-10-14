package services;

import domains.Account;
import repositories.AccountRepositoryDAO;

public class AccountService {
    AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();

    public Account signUp(String name, String lastName , String username , String password, String phoneNumber) {
        Account account = new Account();
        account.setName(name);
        account.setLastName(lastName);
        account.setUsername(username);
        account.setPassword(password);
        account.setPhoneNumber(phoneNumber);
        accountRepositoryDAO.save(account);
        return account;
    }
}
