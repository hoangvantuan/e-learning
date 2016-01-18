package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.Word;
import framgiavn.project01.web.model.WordAnswer;

public interface WordAnswerBusiness {

  public List<WordAnswer> getWordAnswer(Word word) throws Exception;
}
