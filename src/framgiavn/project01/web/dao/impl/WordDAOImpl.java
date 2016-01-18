package framgiavn.project01.web.dao.impl;

import framgiavn.project01.web.dao.WordDAO;
import framgiavn.project01.web.model.Word;
import framgiavn.project01.web.ulti.Logit2;

public class WordDAOImpl extends GenericDAOImpl<Word, Integer>
    implements WordDAO {

  public WordDAOImpl() {

    super(Word.class);
  }

  private static final Logit2 log = Logit2.getInstance(WordDAOImpl.class);
}
