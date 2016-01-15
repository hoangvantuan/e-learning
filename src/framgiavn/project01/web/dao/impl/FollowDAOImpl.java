package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.hibernate.Query;

import framgiavn.project01.web.dao.FollowDAO;
import framgiavn.project01.web.model.Follow;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.Helpers;
import framgiavn.project01.web.ulti.Logit2;

public class FollowDAOImpl extends GenericDAOImpl<Follow, Integer> implements
    FollowDAO {

  private static final Logit2 log = Logit2.getInstance(FollowDAOImpl.class);

  public FollowDAOImpl() {

    super(Follow.class);
  }

  @Override
  public List<Follow> getFollowing(User user) throws Exception {

    try {
      Query query = getSession().getNamedQuery("Follow.getFollowing");
      query.setParameter("user_id", user.getUserId());
      return (List<Follow>) query.list();
    } catch (Exception e) {
      log.error("Following not avalible");
      throw e;
    }
  }

  @Override
  public List<Follow> getFollower(User user) throws Exception {

    try {
      Query query = getSession().getNamedQuery("Follow.getFollower");
      query.setParameter("user_id", user.getUserId());
      return query.list();
    } catch (Exception e) {
      log.error("Follower not avalible");
      throw e;
    }
  }

  @Override
  public boolean isFollowing(Follow follow) throws Exception {

    try {
      Query query = getSession().getNamedQuery("Follow.isFollowing");
      query.setParameter("following_id", follow.getFollowingId());
      query.setParameter("follower_id", follow.getFollowerId());
      return !Helpers.isEmpty(query.list());
    } catch (Exception e) {
      throw e;
    }
  }

  @Override
  public Follow getDataFollow(Follow follow) throws Exception {

    try {
      Query query = getSession().getNamedQuery("Follow.getDataFollow");
      query.setParameter("following_id", follow.getFollowingId());
      query.setParameter("follower_id", follow.getFollowerId());
      return (Follow) query.uniqueResult();
    } catch (Exception e) {
      throw e;
    }
  }
}
