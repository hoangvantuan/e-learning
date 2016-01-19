package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.WordBusiness;
import framgiavn.project01.web.dao.WordDAO;
import framgiavn.project01.web.model.Word;
import framgiavn.project01.web.ulti.Logit2;

public class WordBusinessImpl implements WordBusiness {

  private static final Logit2 log = Logit2.getInstance(WordBusinessImpl.class);
  private WordDAO             wordDAO;

  public WordDAO getWordDAO() {

    return wordDAO;
  }

  public void setWordDAO(WordDAO wordDAO) {

    this.wordDAO = wordDAO;
  }

  @Override
  public List<Word> listAll() throws Exception {

    try {
      return getWordDAO().listAll();
    } catch (Exception e) {
      log.error(e);
      throw e;
    }

  }
}
