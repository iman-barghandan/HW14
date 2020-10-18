package services;

import domains.Account;
import domains.Comment;
import domains.Post;
import repositories.CommentRepositoryDAO;
import repositories.PostRepositoryDAO;


import java.util.Date;


public class CommentService {
    CommentRepositoryDAO commentRepositoryDAO = CommentRepositoryDAO.getInstance();
    PostRepositoryDAO postRepositoryDAO = PostRepositoryDAO.getInstance();

    public void addComment(Account account, long postId, String commentText) {
        Post post = postRepositoryDAO.selectById(postId);
        if (post != null) {
            Comment comment = new Comment();
            comment.setAccount(account);
            comment.setCreateDate(new Date());
            comment.setPost(post);
            comment.setText(commentText);
            commentRepositoryDAO.save(comment);
            post.addComment(comment);
        }
    }

    public void deletePostByFkAccount(long fkAccountId)
    {
        commentRepositoryDAO.removeByFkAccount("Comment" , fkAccountId);
    }
}
