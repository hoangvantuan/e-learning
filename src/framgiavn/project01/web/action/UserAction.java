package framgiavn.project01.web.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.User;

public class UserAction extends ActionSupport implements SessionAware {

  /**
	 * 
	 */
  private static final long          serialVersionUID = 1L;

  // private Logit2 log = Logit2.getInstance(UserAction.class);

  private UserBusiness               userBusiness     = null;
  private User                       user             = null;
  private SessionMap<String, Object> session;

  public void setUserBusiness(UserBusiness userBusiness) {

    this.userBusiness = userBusiness;
  }

  public User getUser() {

    return user;
  }

  public void setUser(User user) {

    this.user = user;
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

  public String homePage() {

    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    return SUCCESS;
  }

  public String getSuccess() {

    return SUCCESS;
  }

  @Override
  public void setSession(Map<String, Object> session) {

    this.session = (SessionMap) session;
  }
}
