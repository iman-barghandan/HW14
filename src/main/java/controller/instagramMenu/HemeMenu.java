package controller.instagramMenu;


import domains.Account;
import scanner.ScannerClass;

public class HemeMenu {
    public static void show(Account account) {
        int selectedNumber;
        while (true) {
            System.out.println("(1) Posts\n" +
                    "(2) Posts with the most likes\n" +
                    "(3) Add post\n" +
                    "(4) Edit post\n" +
                    "(5) Delete post\n" +
                    "(6) Search account\n" +
                    "(7) Edit account\n" +
                    "(8) Delete account\n" +
                    "(9) Sign-OUT");
            selectedNumber = ScannerClass.getNumber(1, 9);

            if (selectedNumber == 1) {
                PostsMenu.show(account);
            } else if (selectedNumber == 2) {

            } else if (selectedNumber == 3) {

            } else if (selectedNumber == 4) {

            } else if (selectedNumber == 5) {

            } else if (selectedNumber == 6) {

            } else if (selectedNumber == 7) {

            } else if (selectedNumber == 8) {

            } else {
                break;
            }
        }
    }
}
