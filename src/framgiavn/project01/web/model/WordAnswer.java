package framgiavn.project01.web.model;

import java.io.Serializable;
import java.util.Date;

public class WordAnswer implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int               wordAnswerId;
  private int               wordId;
  private String            content;
  private Boolean           correct;
  private Date              createdAt;
  private Date              updatedAt;

  public int getWordAnswerId() {

    return wordAnswerId;
  }

  public void setWordAnswerId(int wordAnswerId) {

    this.wordAnswerId = wordAnswerId;
  }

  public int getWordId() {

    return wordId;
  }

  public void setWordId(int wordId) {

    this.wordId = wordId;
  }

  public String getContent() {

    return content;
  }

  public void setContent(String content) {

    this.content = content;
  }

  public Boolean isCorrect() {

    return correct;
  }

  public void setCorrect(Boolean correct) {

    this.correct = correct;
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
