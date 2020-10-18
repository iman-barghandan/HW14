package repositories;

import domains.Account;

public class AccountRepositoryDAO extends BaseRepositoryDAO<Account, Long> {
    private static AccountRepositoryDAO accountRepositoryDAO;

    private AccountRepositoryDAO() {
    }

    public static AccountRepositoryDAO getInstance() {
        if (accountRepositoryDAO == null) {
            accountRepositoryDAO = new AccountRepositoryDAO();
        }
        return accountRepositoryDAO;
    }



    @Override
    protected Class<Account> getEntityClass() {
        return Account.class;
    }
}
