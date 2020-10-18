package controller.instagramMenu;
import domains.Account;
import scanner.ScannerClass;
import services.AccountService;


public class EditAccountMenu {
    public static void show(Account account)
    {
        System.out.println("Name: ");
        String newName = ScannerClass.getString();

        System.out.println("LastName: ");
        String newLastName = ScannerClass.getString();

        System.out.println("userName: ");
        String newUserName = ScannerClass.getString();

        System.out.println("Password: ");
        String newPassword = ScannerClass.getString();

        System.out.println("PhoneNumber: ");
        String newPhoneNumber = ScannerClass.getString();

        AccountService accountService = new AccountService();
        accountService.editAccount(account,newName,newLastName,newUserName,newPassword,newPhoneNumber);
    }
}
