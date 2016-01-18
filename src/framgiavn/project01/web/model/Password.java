package framgiavn.project01.web.model;

import java.io.Serializable;

public class Password implements Serializable {
  
  private String oldPassword;
  private String newPassword;
  private String confirmPassword;
  
  /**
   * @return the oldPassword
   */
  public String getOldPassword() {
  
    return oldPassword;
  }
  
  /**
   * @param oldPassword the oldPassword to set
   */
  public void setOldPassword(String oldPassword) {
  
    this.oldPassword = oldPassword;
  }
  
  /**
   * @return the newPassword
   */
  public String getNewPassword() {
  
    return newPassword;
  }
  
  /**
   * @param newPassword the newPassword to set
   */
  public void setNewPassword(String newPassword) {
  
    this.newPassword = newPassword;
  }
  
  /**
   * @return the confirmPassword
   */
  public String getConfirmPassword() {
  
    return confirmPassword;
  }
  
  /**
   * @param confirmPassword the confirmPassword to set
   */
  public void setConfirmPassword(String confirmPassword) {
  
    this.confirmPassword = confirmPassword;
  }
  
}
