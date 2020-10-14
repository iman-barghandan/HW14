import services.AccountService;

public class MainApp {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.signUp("iman","brg","u4","p4","30");
    }
}
