package services;

import domains.Account;
import domains.Comment;
import domains.Post;
import repositories.AccountRepositoryDAO;
import repositories.PostRepositoryDAO;

import java.util.List;
import java.util.Set;

public class PostService {
    AccountRepositoryDAO accountRepositoryDAO = AccountRepositoryDAO.getInstance();
    PostRepositoryDAO postRepositoryDAO = PostRepositoryDAO.getInstance();

    public void selectPosts(Account inputAccount)
    {
        Account account = accountRepositoryDAO.selectById(inputAccount.getId());
        if (account!=null)
        {
            List<Post> postList = account.getPostList();


            selectPosts(postList);
            Set<Account> accountSet = account.getFollowers();
            if (accountSet.size()>0)
            {
                for (Account item : accountSet)
                {
                    selectPosts(item.getPostList());
                }
            }

        }
    }

    public void selectPosts(List<Post> postList)
    {
        if (postList.size()>0)
        {
            for (Post item : postList)
            {
                System.out.println("Post ID: "+ item.getId());
                System.out.println("UserName: "+ item.getAccount().getUsername());
                System.out.println("Post Text: " + item.getTextPost());
                System.out.println("Number Like: " + item.getLikeList().size());

                List<Comment> comments =  item.getCommentList();
                if (comments.size()>0)
                {
                    System.out.println(">>>Comments<<<");
                    for (Comment c : comments)
                    {
                        System.out.println("-------------");
                        System.out.println("UserName: " + c.getAccount().getUsername());
                        System.out.println("Comment Date: "+ c.getCreateDate());
                        System.out.println("Comment Text: " + c.getText());
                        System.out.println("-------------");
                    }
                }
                System.out.println("******************");
            }
        }
    }
}
