package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.FollowBusiness;
import framgiavn.project01.web.dao.FollowDAO;
import framgiavn.project01.web.model.Follow;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.Logit2;

public class FollowBusinessImpl implements FollowBusiness {

  private static final Logit2 log = Logit2
      .getInstance(FollowBusinessImpl.class);
  private FollowDAO           followDAO;

  public FollowDAO getFollowDAO() {

    return followDAO;
  }

  public void setFollowDAO(FollowDAO followDAO) {

    this.followDAO = followDAO;
  }

  @Override
  public List<Follow> getFollowing(User user) {

    try {
      return getFollowDAO().getFollowing(user);
    } catch (Exception e) {
      log.error(e);
      return null;
    }
  }

  @Override
  public List<Follow> getFollower(User user) {

    try {
      return getFollowDAO().getFollower(user);
    } catch (Exception e) {
      log.error(e);
      return null;
    }

  }

  @Override
  public boolean addFollower(Follow follow) {

    try {
      getFollowDAO().save(follow);
      return true;
    } catch (Exception e) {
      log.error(e);
      return false;
    }

  }

  @Override
  public boolean deleteFollow(Follow follow) {

    try {
      getFollowDAO().delete(follow);
      return true;
    } catch (Exception e) {
      log.error(e);
      return false;
    }
  }

  @Override
  public boolean isFollowing(Follow follow) {

    try {
      return getFollowDAO().isFollowing(follow);
    } catch (Exception e) {
      log.error(e);
      return false;
    }

  }

  @Override
  public Follow getDataFollow(Follow follow) {

    try {
      return getFollowDAO().getDataFollow(follow);
    } catch (Exception e) {
      log.error(e);
      return null;
    }
  }
}
