package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.WordAnswer;

public interface WordAnswerBusiness {

  public List<WordAnswer> listAll() throws Exception;

  public List<WordAnswer> findAllAnswerByWordId(Object value) throws Exception;
}
