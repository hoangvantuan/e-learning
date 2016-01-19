package framgiavn.project01.web.dao.impl;

import java.util.List;

import org.hibernate.Query;

import framgiavn.project01.web.dao.WordAnswerDAO;
import framgiavn.project01.web.model.WordAnswer;
import framgiavn.project01.web.ulti.Logit2;

public class WordAnswerDAOImpl extends GenericDAOImpl<WordAnswer, Integer>
    implements WordAnswerDAO {

  public WordAnswerDAOImpl() {

    super(WordAnswer.class);
  }

  private static final Logit2 log = Logit2.getInstance(WordAnswerDAOImpl.class);

  @Override
  public List<WordAnswer> findByProperty(String propertyName, Object value)
      throws Exception {

    try {
      Query query = getSession().getNamedQuery("WordAnswer.findByProperty");
      query.setParameter("propertyName", propertyName);
      query.setParameter("value", value);
      return (List<WordAnswer>) query.list();
    } catch (Exception e) {
      log.error("error find by proerty");
      throw e;

    }
  }
}
