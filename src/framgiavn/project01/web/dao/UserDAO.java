package framgiavn.project01.web.dao;

import java.util.List;

import framgiavn.project01.web.model.User;

public interface UserDAO extends GenericDAO<User, Integer> {
	public User checkLogin(User user) throws Exception;	
	public User checkAccountAvalible(User user) throws Exception;
}