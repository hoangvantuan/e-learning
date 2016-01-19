package framgiavn.project01.web.business;

import java.util.List;

import framgiavn.project01.web.model.Category;

public interface CategoryBusiness {

  public List<Category> listAll() throws Exception;
}
