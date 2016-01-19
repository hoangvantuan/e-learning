package framgiavn.project01.web.model;

import java.io.Serializable;
import java.util.Date;


public class Category implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int               categoryId;
  private String            name;
  private Date              createdAt;
  private Date              updatedAt;
  
  public int getCategoryId() {

    return categoryId;
  }

  public void setCategoryId(int categoryId) {

    this.categoryId = categoryId;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public Date getCreatedAt() {

    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {

    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {

    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {

    this.updatedAt = updatedAt;
  }

}
