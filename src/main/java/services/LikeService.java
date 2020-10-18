package services;

import domains.Account;
import domains.Like;
import domains.Post;
import repositories.LikeRepositoryDAO;
import repositories.PostRepositoryDAO;


public class LikeService {
    LikeRepositoryDAO likeRepositoryDAO = LikeRepositoryDAO.getInstance();
    PostRepositoryDAO postRepositoryDAO = PostRepositoryDAO.getInstance();

    public void likeComment(Account account, long postId) {
        Post post = postRepositoryDAO.selectById(postId);
        if (post != null) {
            Like like = new Like();
            like.setAccount(account);
            like.setPost(post);
            likeRepositoryDAO.save(like);
            post.addLike(like);
        }
    }

    public void deletePostByFkAccount(long fkAccountId)
    {
        likeRepositoryDAO.removeByFkAccount("Like" , fkAccountId);
    }
}
