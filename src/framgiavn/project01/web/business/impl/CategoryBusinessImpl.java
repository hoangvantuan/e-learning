package framgiavn.project01.web.business.impl;

import java.util.List;

import framgiavn.project01.web.business.CategoryBusiness;
import framgiavn.project01.web.dao.CategoryDAO;
import framgiavn.project01.web.model.Category;
import framgiavn.project01.web.ulti.Logit2;

public class CategoryBusinessImpl implements CategoryBusiness {

  private CategoryDAO         categoryDAO;
  private static final Logit2 log = Logit2
                                      .getInstance(CategoryBusinessImpl.class);

  public CategoryDAO getCategoryDAO() {

    return categoryDAO;
  }

  public void setCategoryDAO(CategoryDAO categoryDAO) {

    this.categoryDAO = categoryDAO;
  }

  @Override
  public List<Category> listAll() throws Exception {

    try {
      return getCategoryDAO().listAll();
    } catch (Exception e) {
      log.error(e);
      throw e;
    }
  }

}
