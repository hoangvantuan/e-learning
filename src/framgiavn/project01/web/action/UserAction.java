package framgiavn.project01.web.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.FollowBusiness;
import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.Follow;
import framgiavn.project01.web.model.Password;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.User.UserHelpers;

public class UserAction extends ActionSupport implements SessionAware {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  // private Logit2 log = Logit2.getInstance(UserAction.class);

  private UserBusiness   userBusiness   = null;
  private FollowBusiness followBusiness = null;
  private User           user           = null;
  private Follow         follow         = null;
  private List<Follow>   listFollow     = null;
  private Password       password       = null;

  private long                       joinedDay;
  private SessionMap<String, Object> session;

  public Follow getFollow() {

    return follow;
  }

  public void setFollow(Follow follow) {

    this.follow = follow;
  }

  public List<Follow> getListFollow() {

    return listFollow;
  }

  public void setListFollow(List<Follow> listFollow) {

    this.listFollow = listFollow;
  }

  public void setUserBusiness(UserBusiness userBusiness) {

    this.userBusiness = userBusiness;
  }

  public void setFollowBusiness(FollowBusiness followBusiness) {

    this.followBusiness = followBusiness;
  }

  public User getUser() {

    return user;
  }

  public void setUser(User user) {

    this.user = user;
  }

  public Password getPassword() {

    return password;
  }

  public void setPassword(Password password) {

    this.password = password;
  }

  public long getJoinedDay() {

    return joinedDay;
  }

  public String findByUserId() {

    try {
      user = userBusiness.findByUserId(user.getUserId());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return SUCCESS;
  }

  public String findByUsername() {

    try {
      user = userBusiness.findByUsername(user.getUsername());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return SUCCESS;
  }

  public String findByEmail() {

    try {
      user = userBusiness.findByEmail(user.getEmail());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return SUCCESS;
  }

  public String checkLogin() {

    try {
      user = userBusiness.checkLogin(user);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (user != null) {
      session.put("user", user);
      return SUCCESS;
    } else {
      addActionError("Username or Password was wrong!");
      return ERROR;
    }
  }

  public String signup() {

    if (userBusiness.checkAccountAvalible(user) == null) {
      user.setCreatedAt(new Date());
      user.setAvatar("/JavaProject02/image/common/usernotfound.jpeg");
      try {
        userBusiness.signup(user);
      } catch (Exception e) {
        e.printStackTrace();
      }
      addActionMessage("Signup successfull! Please login");
      return SUCCESS;
    } else {
      addActionError("Username Or Email was avalible!");
      return ERROR;
    }

  }

  public String logout() {

    if (session != null) {
      session.invalidate();
    }
    return SUCCESS;
  }

  public String changePassword() {

    if (!session.isEmpty()) {
      user = UserHelpers.getUserFromSession("user");
      if (user != null) {
        if (password != null) {
          if (UserHelpers.checkOldPassword(user, password)) {
            if (UserHelpers.checkConfirmPassword(password)) {
              user.setPassword(password.getNewPassword());
              user.setUpdatedAt(new Date());
              try {
                userBusiness.update(user);
                addActionMessage("Password changed");
                return SUCCESS;
              } catch (Exception e) {
                e.printStackTrace();
              }
              addActionError("Have errors while update !");
              return ERROR;
            } else {
              addActionError("Comfirm password was wrong");
              return ERROR;
            }
          } else {
            addActionError("Old password was wrong");
            return ERROR;
          }
        } else {
          return ERROR;
        }
      }
    }
    return NONE;
  }

  public String changeAvatar() {

    return SUCCESS;
  }

  public String showProfile() {

    if (!session.isEmpty()) {
      user = UserHelpers.getUserFromSession("user");
      if (user != null) {
        joinedDay = UserHelpers.getJoinedDay(user.getCreatedAt());
        listFollow = followBusiness.getFollowing(user);
        return SUCCESS;
      } else {
        return ERROR;
      }
    } else {
      return ERROR;
    }
  }

  public String homePage() {

    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    return SUCCESS;
  }

  @Override
  public void setSession(Map<String, Object> session) {

    this.session = (SessionMap) session;
  }

}
