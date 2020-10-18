package services;

import domains.Account;
import repositories.AccountRepositoryDAO;
import repositories.CommentRepositoryDAO;
import repositories.LikeRepositoryDAO;
import repositories.PostRepositoryDAO;

import java.util.Date;
import java.util.List;

public class AccountService {
    AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();
    PostRepositoryDAO postRepositoryDAO = PostRepositoryDAO.getInstance();
    LikeRepositoryDAO likeRepositoryDAO = LikeRepositoryDAO.getInstance();
    CommentRepositoryDAO commentRepositoryDAO = CommentRepositoryDAO.getInstance();

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

    public Account findByUserName(String userName) {
        Account account = accountRepositoryDAO.findByUserName(userName);
        if (account != null) {
            System.out.println("Account Id: " + account.getId());
            System.out.println("Name: " + account.getName());
            System.out.println("LastName: " + account.getLastName());
            System.out.println("UserName: " + account.getUsername());
        }
        return account;
    }

    public void deleteAccount(Account account) {
        accountRepositoryDAO.remove(account);
        postRepositoryDAO.removeByFkAccount("Post", account.getId());
        commentRepositoryDAO.removeByFkAccount("Comment", account.getId());
        likeRepositoryDAO.removeByFkAccount("Like", account.getId());
    }


    public void editAccount(Account account, String newName, String newLastName, String newUsername, String newPassword, String newPhoneNumber) {
        account.setName(newName);
        account.setLastName(newLastName);
        account.setUsername(newUsername);
        account.setPassword(newPassword);
        account.setPhoneNumber(newPhoneNumber);
        accountRepositoryDAO.update(account);
        System.out.println("Done! information updated");
    }
}
