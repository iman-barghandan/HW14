package repositories;

import domains.Comment;

public class CommentRepositoryDAO extends BaseRepositoryDAO<Comment, Long> {
    private static CommentRepositoryDAO commentRepositoryDAO;

    private CommentRepositoryDAO() {
    }

    public static CommentRepositoryDAO getInstance() {
        if (commentRepositoryDAO == null) {
            commentRepositoryDAO = new CommentRepositoryDAO();
        }
        return commentRepositoryDAO;
    }

    @Override
    protected Class<Comment> getEntityClass() {
        return Comment.class;
    }
}
