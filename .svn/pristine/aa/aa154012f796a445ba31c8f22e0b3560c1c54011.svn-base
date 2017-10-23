package com.ease.dao.impl;

import java.util.List;

import com.ease.doa.UserTestDao;
import com.ease.model.UserTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userTestDao")
public class UserDaoTestImpl implements UserTestDao {

	@Autowired
	SessionFactory sessionFactory;
	protected Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(UserTest user) {
		currentSession().save(user);
	}

	@Override
	public void update(UserTest user) {
		currentSession().update(user);
	}

	@Override
	public UserTest edit(Long userId) {
		return find(userId);
	}

	@Override
	public void delete(Long userId) {
		Session session ;
		UserTest userTest;

	    session = sessionFactory.getCurrentSession();
	    //session.delete(userId);
	    userTest = (UserTest)session.load(UserTest.class,userId);
	    session.delete(userTest);
	    session.flush() ;

	}

	@Override
	public UserTest find(Long userId) {
		return (UserTest)currentSession().get(UserTest.class,userId);
	}
	

	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<UserTest> getAll() {
		 return currentSession().createCriteria(UserTest.class).list();
	}

	@Override
	public List<UserTest> findRole(){
		String hql = "from User where 1=1";
            hql=hql+" and RoleId='"+1+"'";
            Query query = sessionFactory.getCurrentSession().createQuery(hql);
            @SuppressWarnings("deprecation")
			List<UserTest> list=query.list();
            return list;
	}
}

