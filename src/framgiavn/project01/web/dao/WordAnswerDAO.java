package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.WordAnswer;

public interface WordAnswerDAO extends GenericDAO<WordAnswer, Integer> {

  public List<WordAnswer> findByProperty(String propertyName, Object value)
      throws Exception;
}
