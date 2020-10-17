import controller.MainMenu;
import domains.Account;
//import domains.Follower;
import domains.Post;
import repositories.AccountRepositoryDAO;
import services.AccountService;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        MainMenu.showMenu();
//        Account account = new Account();
//        account.setName("r");
//        account.setLastName("br");
//        account.setUsername("sr");
//        account.setPassword("sr");
//        account.setPhoneNumber("1111111r");
//        account.setCreateDate(new Date());
//        AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();
//        accountRepositoryDAO.save(account);



//        Post post = new Post();
//        post.setCreateDate(new Date());
//        post.setId(2L);
//        post.setTextPost("post10");
//        post.setAccount(account);
//
//        List<Post> posts = new ArrayList<>();
//        posts.add(post);
//
//        account.setPostList(posts);

//        Follower follower = new Follower();
//
//        Account account2 = new Account();
//        account2.setName("najme");
//        account2.setLastName("brg");
//        account2.setUsername("najme");
//        account2.setPassword("najme");
//        account2.setPhoneNumber("1623");
//        account2.setCreateDate(new Date());
//        follower.setAccount(account2);
//
//        List<Follower> followers = new ArrayList<>();
//        followers.add(follower);

//        account.setFollowerList(followers);
//        AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();
//        Account iman = accountRepositoryDAO.selectById(54L);
//        Account ali = accountRepositoryDAO.selectById(55L);



//        Set<Account> accountList = new HashSet<>();
//        accountList.add(ali);
//        iman.getFollowers().remove(ali);

//        iman.setFollowers(accountList);
//        accountRepositoryDAO.update(iman);
//        Account account = new Account();
//        account.setName("iman");
//        account.setLastName("brg");
//        account.setUsername("iman");
//        account.setPassword("iman");
//        account.setPhoneNumber("1813");
//        account.setCreateDate(new Date());
//        accountRepositoryDAO.save(account);

//        Account account2 = new Account();
//        account2.setName("ali");
//        account2.setLastName("brg");
//        account2.setUsername("ali");
//        account2.setPassword("ali");
//        account2.setPhoneNumber("3011");
//        account2.setCreateDate(new Date());
//        accountRepositoryDAO.save(account2);

//        List<Account> accountList = new ArrayList<>();
//        Account account = new Account();
//        account.setId(50L);
//        accountList.add(account);
//
//        account1.setFollowerList(accountList);
//        accountRepositoryDAO.update(account1);










//        if (account==null) System.out.println("nuuuuuuuullllllll");
//        List<Follower> followers = account.getFollowerList();
//        if (followers.size()==0) System.out.println("naaaaaaa");
//        for (Follower item : followers)
//        {
//            System.out.println(item.getId());
//            System.out.println(item.getAccount().getName());
//        }
//        accountRepositoryDAO.save(account);




    }
}
