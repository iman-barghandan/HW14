package controller;

import scanner.ScannerClass;

public class MainMenu {
    public static void showMenu() {
        int selectedNumber;
        while (true) {
            System.out.println("(1) Sign-In\n" +
                    "(2) Sign-Up\n" +
                    "(3) End program");
            selectedNumber = ScannerClass.getNumber(1, 3);

            if (selectedNumber == 1) {
                SignInMenu.show();
            } else if (selectedNumber == 2) {
                SignUpMenu.show();
            } else {
                break;
            }
        }
    }
}
