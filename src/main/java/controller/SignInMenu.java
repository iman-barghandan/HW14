package controller;

import controller.instagramMenu.HemeMenu;
import domains.Account;
import scanner.ScannerClass;
import services.AccountService;


public class SignInMenu {
    public static void show() {
        System.out.println("Username: ");
        String userName = ScannerClass.getString();

        System.out.println("Password: ");
        String password = ScannerClass.getString();

        AccountService accountService = new AccountService();
        Account account = accountService.selectByUserNameAndPassword(userName, password);
        if (account != null) {
            HemeMenu.show(account);
        } else System.out.println("You did not register");
    }
}
