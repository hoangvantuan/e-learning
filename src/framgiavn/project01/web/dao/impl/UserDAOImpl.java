package framgiavn.project01.web.dao.impl;

import org.hibernate.Query;

import framgiavn.project01.web.dao.UserDAO;
import framgiavn.project01.web.model.User;
import framgiavn.project01.web.ulti.Logit2;

public class UserDAOImpl extends GenericDAOImpl<User, Integer> implements UserDAO {

	public UserDAOImpl() {
		super(User.class);
	}

	private static final Logit2 log = Logit2.getInstance(UserDAOImpl.class);
	public static final String NAME = "customerName";

	protected void initDAO() {
		// Do nothing
	}

	public User checkLogin(User user) throws Exception {
		try {
			Query query = getSession().getNamedQuery("User.CheckLogin");
			query.setParameter("username", user.getUsername());
			query.setParameter("password", user.getPassword());
			return (User) query.uniqueResult();
		} catch (RuntimeException re) {
			log.error("Get failed login", re);
			throw re;
		}
	}

}