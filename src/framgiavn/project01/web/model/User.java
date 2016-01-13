package framgiavn.project01.web.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int userId;
	private String username;
	private String password;
	private String email;
	private String avatar;
	private Date createdAt;
	private Date updatedAt;
	private boolean isAdmin;
  
  /**
   * @return the userId
   */
  public int getUserId() {
  
    return userId;
  }
  
  /**
   * @param userId the userId to set
   */
  public void setUserId(int userId) {
  
    this.userId = userId;
  }
  
  /**
   * @return the username
   */
  public String getUsername() {
  
    return username;
  }
  
  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
  
    this.username = username;
  }
  
  /**
   * @return the password
   */
  public String getPassword() {
  
    return password;
  }
  
  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
  
    this.password = password;
  }
  
  /**
   * @return the email
   */
  public String getEmail() {
  
    return email;
  }
  
  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
  
    this.email = email;
  }
  
  /**
   * @return the avatar
   */
  public String getAvatar() {
  
    return avatar;
  }
  
  /**
   * @param avatar the avatar to set
   */
  public void setAvatar(String avatar) {
  
    this.avatar = avatar;
  }
  
  /**
   * @return the createdAt
   */
  public Date getCreatedAt() {
  
    return createdAt;
  }
  
  /**
   * @param createdAt the createdAt to set
   */
  public void setCreatedAt(Date createdAt) {
  
    this.createdAt = createdAt;
  }
  
  /**
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
  
    return updatedAt;
  }
  
  /**
   * @param updatedAt the updatedAt to set
   */
  public void setUpdatedAt(Date updatedAt) {
  
    this.updatedAt = updatedAt;
  }
  
  /**
   * @return the isAdmin
   */
  public boolean getIsAdmin() {
  
    return isAdmin;
  }
  
  /**
   * @param isAdmin the isAdmin to set
   */
  public void setIsAdmin(boolean isAdmin) {
  
    this.isAdmin = isAdmin;
  }

}