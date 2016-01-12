package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.Helpers;
import framgiavn.project01.web.ulti.Logit2;

public class UserBusinessImpl implements UserBusiness {

  private static final Logit2 log = Logit2.getInstance(UserBusinessImpl.class);

  private UserDAO             userDAO;

  public UserDAO getUserDAO() {

    return userDAO;
  }

  public void setUserDAO(UserDAO userDAO) {

    this.userDAO = userDAO;
  }

  @Override
  public User findByUserId(Integer user_id) {

    try {
      return getUserDAO().findById(user_id);
    } catch (Exception e) {
      log.error(e);
      return null;
    }
  }

  @Override
  public User findByUsername(String username) {

    try {
      List<User> list = getUserDAO().findByProperty("username", username);
      return Helpers.isEmpty(list) ? null : list.get(0);
    } catch (Exception e) {
      log.error(e);
      return null;
    }
  }

  @Override
  public User findByEmail(String email) {

    try {
      List<User> list = getUserDAO().findByProperty("email", email);
      return Helpers.isEmpty(list) ? null : list.get(0);
    } catch (Exception e) {
      log.error(e);
      return null;
    }
  }

  public boolean signup(User user) {

    try {
      getUserDAO().save(user);
      return true;
    } catch (Exception e) {
      log.error(e);
      return false;
    }
  }

  @Override
  public User checkLogin(User user) {

    try {
      return getUserDAO().checkLogin(user);
    } catch (Exception e) {
      log.error(e);
      return null;
    }
  }

  @Override
  public boolean checkAccountAvalible(User user) {

    if (findByEmail(user.getEmail()) == null
        && findByUsername(user.getUsername()) == null)
      return true;
    else
      return false;
  }

}
