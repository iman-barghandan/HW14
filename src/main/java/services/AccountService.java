package services;

import domains.Account;
import repositories.AccountRepositoryDAO;

import java.util.Date;
import java.util.List;

public class AccountService {
    AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();

    public Account signUp(String name, String lastName, String username, String password, String phoneNumber) {
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

    public Account selectByUserNameAndPassword(String userName, String password) {
        List<Account> accountList = accountRepositoryDAO.selectAll();
        Account account = null;
        if (accountList.size() > 0) {
            for (Account item : accountList) {
                if (item.getUsername().equals(userName) && item.getPassword().equals(password)) {
                    System.out.println("welcome");
                    account = item;
                }
            }
        }

        return account;
    }

    public Account findByUserName(String userName)
    {
        Account account = accountRepositoryDAO.findByUserName(userName);
        if (account!=null)
        {
            System.out.println("Account Id: " + account.getId());
            System.out.println("Name: " + account.getName());
            System.out.println("LastName: " + account.getLastName());
            System.out.println("UserName: " + account.getUsername());
        }
        return account;
    }
}
