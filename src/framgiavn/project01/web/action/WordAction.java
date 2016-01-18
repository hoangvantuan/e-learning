package framgiavn.project01.web.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.WordAnswerBusiness;
import framgiavn.project01.web.business.WordBusiness;
import framgiavn.project01.web.model.Word;
import framgiavn.project01.web.model.WordAnswer;

public class WordAction extends ActionSupport implements SessionAware {

  private SessionMap         session            = null;
  private WordBusiness       wordBusiness       = null;
  private WordAnswerBusiness wordAnswerBusiness = null;
  private List<Word>         listWord           = null;

  public void setWordBusiness(WordBusiness wordBusiness) {

    this.wordBusiness = wordBusiness;
  }

  public void setWordAnswerBusiness(WordAnswerBusiness wordAnswerBusiness) {

    this.wordAnswerBusiness = wordAnswerBusiness;
  }

  @Override
  public void setSession(Map<String, Object> session) {

    this.session = (SessionMap) session;
  }

  public List<Word> getListWord() {

    return this.listWord;
  }

  public String listAll() {

    try {
      listWord = wordBusiness.listAllWord();
//      List<WordAnswer> wa = wordAnswerBusiness.getWordAnswer(listWord.get(0));
      return SUCCESS;
    } catch (Exception e) {
      e.printStackTrace();
      return ERROR;
    }

  }

}
