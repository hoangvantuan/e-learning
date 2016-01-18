package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserBusiness {

  public User findByUserId(Integer user_id);

  public User findByUsername(String username);

  public User findByEmail(String email);

  public User checkLogin(User user);

  public User checkAccountAvalible(User user);

  public boolean signup(User user);

  public boolean update(User user);

  public List<User> searchByUsername(String key);

}
