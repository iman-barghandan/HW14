package repositories;

import domains.Post;

public class PostRepositoryDAO extends BaseRepositoryDAO<Post, Long> {
    private static PostRepositoryDAO postRepositoryDAO;

    private PostRepositoryDAO() {
    }

    public static PostRepositoryDAO getInstance() {
        if (postRepositoryDAO == null) {
            postRepositoryDAO = new PostRepositoryDAO();
        }
        return postRepositoryDAO;
    }

    @Override
    protected Class<Post> getEntityClass() {
        return Post.class;
    }
}
