package controller;

import controller.instagramMenu.HemeMenu;
import domains.Account;
import scanner.ScannerClass;
import services.AccountService;

public class SignUpMenu {
    public static void show() {
        System.out.println("Name: ");
        String name = ScannerClass.getString();

        System.out.println("LastName: ");
        String lastName = ScannerClass.getString();

        System.out.println("userName: ");
        String userName = ScannerClass.getString();

        System.out.println("Password: ");
        String password = ScannerClass.getString();

        System.out.println("PhoneNumber: ");
        String phoneNumber = ScannerClass.getString();

        AccountService accountService = new AccountService();
        Account account = accountService.signUp(name, lastName, userName, password, phoneNumber);
        if (account != null) {
            HemeMenu.show(account);
        }
    }
}
