package framgiavn.project01.web.ulti.User;

import com.opensymphony.xwork2.ActionContext;

import framgiavn.project01.web.model.Password;
import framgiavn.project01.web.model.User;

public final class UserHelpers {

  public static boolean checkConfirmPassword(Password password) {

    return (password.getNewPassword().equals(password.getConfirmPassword()));
  }

  public static boolean checkOldPassword(User user, Password password) {

    return (user.getPassword().equals(password.getOldPassword()));
  }
  
  public static User getUserFromSession(String key) {
    return (User)ActionContext.getContext().getSession().get(key);
  }
}
