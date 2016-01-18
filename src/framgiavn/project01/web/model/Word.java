package framgiavn.project01.web.model;

import java.io.Serializable;
import java.util.Date;

public class Word implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int               wordId;
  private int               categoryId;
  private String            content;
  private Date              createdAt;
  private Date              updatedAt;

  public int getWordId() {

    return wordId;
  }

  public void setWordId(int wordId) {

    this.wordId = wordId;
  }

  public int getCategoryId() {

    return categoryId;
  }

  public void setCategoryId(int categoryId) {

    this.categoryId = categoryId;
  }

  public String getContent() {

    return content;
  }

  public void setContent(String content) {

    this.content = content;
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
