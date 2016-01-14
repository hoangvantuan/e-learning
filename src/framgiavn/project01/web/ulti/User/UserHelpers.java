package framgiavn.project01.web.ulti.User;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    return (User) ActionContext.getContext().getSession().get(key);
  }

  public static long getJoinedDay(Date date) {

    Date currentTime = new Date();
    long diff = currentTime.getTime() - date.getTime();
    return diff / (24 * 60 * 60 * 1000);

  }
}
