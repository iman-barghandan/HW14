package controller.instagramMenu;

import domains.Account;
import scanner.ScannerClass;
import services.AccountService;

public class FollowingMenu {
    public static void show(Account account)
    {
        AccountService accountService = new AccountService();
        int selectedNumber;
        while (true)
        {
            System.out.println("look for USERNAME: ");
            String userName = ScannerClass.getString();
            Account followAccount =accountService.findByUserName(userName);
            if (followAccount!=null)
            {
                System.out.println("(1) Follow\n" +
                        "(2) UnFollow\n" +
                        "(3) BackMenu");
                selectedNumber = ScannerClass.getNumber(1,3);
                if (selectedNumber==1)
                {
                    account.addFollower(followAccount);
                    System.out.println("Done! " + followAccount.getUsername() + " been followed");
                    break;
                }
                else if (selectedNumber==2)
                {
                    if (account.getFollowers().contains(followAccount))
                    {
                        account.deleteFollower(followAccount);
                        System.out.println("Done! " + followAccount.getUsername() + " been unfollowed");
                        break;
                    }
                    else {
                        System.out.println("you have not this follower");
                        break;
                    }
                }
                else {
                    break;
                }
            }
            else {
                break;
            }
        }
    }
}
