package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.Follow;
import framgiavn.project01.web.model.User;

public interface FollowDAO extends GenericDAO<Follow, Integer> {

  public List<Follow> getFollowing(User user) throws Exception;

  public List<Follow> getFollower(User user) throws Exception;

}
