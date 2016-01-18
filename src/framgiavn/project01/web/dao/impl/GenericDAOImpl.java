package framgiavn.project01.web.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.CacheMode;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import framgiavn.project01.web.dao.GenericDAO;
import framgiavn.project01.web.ulti.Logit2;

public class GenericDAOImpl<E, Id extends Serializable> extends
    HibernateDaoSupport implements GenericDAO<E, Id> {

  private static final Logit2 log = Logit2.getInstance(GenericDAOImpl.class);

  private Class<E>            persistentClass;

  public GenericDAOImpl(Class<E> persistentClass) {

    this.persistentClass = persistentClass;
  }

  public Class<E> getPersistentClass() {

    return persistentClass;
  }

  protected void initDao() {

    // do nothing
  }

  public void save(E transientInstance) throws Exception {

    log.debug("saving instance");
    try {
      getHibernateTemplate().save(transientInstance);
      log.debug("save successful");
    } catch (RuntimeException re) {
      log.error("save failed", re);
      throw re;
    }
  }

  @Override
  public void update(E transientInstance) throws Exception {

    log.debug("update instant");
    try {
      getHibernateTemplate().update(transientInstance);
      log.debug("update successfull");
    } catch (RuntimeException re) {
      log.error("update error", re);
      throw re;
    }

  }

  public void delete(E persistentInstance) throws Exception {

    log.debug("deleting instance");
    try {
      getHibernateTemplate().delete(persistentInstance);
      log.debug("delete successful");
    } catch (RuntimeException re) {
      log.error("delete failed", re);
      throw re;
    }
  }

  public E findById(Id id) throws Exception {

    return findById(id, false);
  }

  public E findById(Id id, boolean lock) {

    log.debug("finding instance by Id");

    try {
      E entity;
      if (lock) {
        getSession().setCacheMode(CacheMode.PUT);
        entity = (E) getSession().get(getPersistentClass(), id,
            LockMode.UPGRADE);
      } else {
        entity = (E) getSession().get(getPersistentClass(), id);
      }
      if (entity != null)
        getSession().refresh(entity);
      if (entity == null) {
        getSession().load(getPersistentClass(), id);
      }
      if (entity != null)
        getSession().refresh(entity);
      log.debug("find by Id successful");
      return entity;
    } catch (RuntimeException re) {
      log.error("find by Id failed", re);
      throw re;
    }
  }

  public List<E> findByExample(E instance) throws Exception {

    log.debug("finding instance by example");
    try {
      List results = getHibernateTemplate().findByExample(instance);
      log.debug("find by example successful, result size: " + results.size());
      return results;
    } catch (RuntimeException re) {
      log.error("find by example failed", re);
      throw re;
    }
  }

  @SuppressWarnings("unchecked")
  public List<E> findByProperty(String propertyName, Object value)
      throws Exception {

    log.debug("finding instance with property: " + propertyName + ", value: "
        + value);
    try {
      String queryString = "from as model where model." + propertyName + "= ?";
      return getHibernateTemplate().find(queryString, value);
    } catch (RuntimeException re) {
      log.error("find by property name failed", re);
      throw re;
    }
  }

  public List<E> listAll() throws Exception {

    try {
      return getHibernateTemplate().loadAll(getPersistentClass());
    } catch (RuntimeException re) {
      log.error("listAll failed", re);
      throw re;
    }
  }

}
