package repositories;

import domains.Like;

public class LikeRepositoryDAO extends BaseRepositoryDAO<Like, Long> {
    private static LikeRepositoryDAO likeRepositoryDAO;

    private LikeRepositoryDAO() {
    }

    public static LikeRepositoryDAO getInstance() {
        if (likeRepositoryDAO == null) {
            likeRepositoryDAO = new LikeRepositoryDAO();
        }
        return likeRepositoryDAO;
    }

    @Override
    protected Class<Like> getEntityClass() {
        return Like.class;
    }
}
