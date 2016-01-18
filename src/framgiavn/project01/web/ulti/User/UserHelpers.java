package framgiavn.project01.web.ulti.User;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;

import framgiavn.project01.web.model.Follow;
import framgiavn.project01.web.model.Password;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.Constant;
import framgiavn.project01.web.ulti.Helpers;

public final class UserHelpers {

  public static boolean checkConfirmPassword(Password password) {

    return (password.getNewPassword().equals(password.getConfirmPassword()));
  }

  public static boolean checkOldPassword(User user, Password password) {

    return (user.getPassword().equals(password.getOldPassword()));
  }

  public static User getUserFromSession() {

    return (User) ActionContext.getContext().getSession().get(Constant.CURRENT_USER);
  }

  public static long getJoinedDay(Date date) {

    Date currentTime = new Date();
    long diff = currentTime.getTime() - date.getTime();
    return diff / (24 * 60 * 60 * 1000);

  }

  public static Follow getCurrentFollow(User srcUser, User desUser) {

    Follow curFollow = new Follow();
    curFollow.setFollowingId(srcUser.getUserId());
    curFollow.setFollowerId(desUser.getUserId());
    curFollow.setCreatedAt(Helpers.getCurrentDate());
    return curFollow;
  }
}
