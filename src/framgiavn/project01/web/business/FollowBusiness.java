package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.Follow;
import framgiavn.project01.web.model.User;

public interface FollowBusiness {

	public List<Follow> getFollowing(User user);

	public List<Follow> getFollower(User user);

  public boolean addFollower(Follow follow);

  public boolean deleteFollow(Follow follow);

	public boolean isFollowing(Follow follow);

  public Follow getDataFollow(Follow follow);

}
