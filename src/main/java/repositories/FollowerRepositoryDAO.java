package repositories;

import domains.Follower;

public class FollowerRepositoryDAO extends BaseRepositoryDAO<Follower, Long> {
    private static FollowerRepositoryDAO followerRepositoryDAO;

    private FollowerRepositoryDAO() {
    }

    public static FollowerRepositoryDAO getInstance() {
        if (followerRepositoryDAO == null) {
            followerRepositoryDAO = new FollowerRepositoryDAO();
        }
        return followerRepositoryDAO;
    }

    @Override
    protected Class<Follower> getEntityClass() {
        return Follower.class;
    }
}
