package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.WordAnswerBusiness;
import framgiavn.project01.web.dao.WordAnswerDAO;
import framgiavn.project01.web.model.WordAnswer;
import framgiavn.project01.web.ulti.Logit2;

public class WordAnswerBusinessImpl implements WordAnswerBusiness {

  private static final Logit2 log = Logit2.getInstance(UserBusinessImpl.class);

  private WordAnswerDAO       wordAnswerDAO;

  public WordAnswerDAO getWordAnswerDAO() {

    return wordAnswerDAO;
  }

  public void setWordAnswerDAO(WordAnswerDAO wordAnswerDAO) {

    this.wordAnswerDAO = wordAnswerDAO;
  }

  @Override
  public List<WordAnswer> listAll() throws Exception {

    try {
      return getWordAnswerDAO().listAll();
    } catch (Exception e) {
      throw e;
    }
  }

  public List<WordAnswer> findAllAnswerByWordId(Object value) throws Exception {

    try {
      return getWordAnswerDAO().findByProperty("word_id", value);
    } catch (Exception e) {
      throw e;
    }
  }
}
