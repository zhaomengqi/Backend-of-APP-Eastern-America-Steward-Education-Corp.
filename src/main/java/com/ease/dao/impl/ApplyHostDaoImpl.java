package com.ease.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ease.doa.ApplyHostDao;
import com.ease.model.ApplyHost;

@Repository("applyHostDaoImpl")
public class ApplyHostDaoImpl implements ApplyHostDao{

	@Autowired
	SessionFactory sessionFactory;
	protected Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(ApplyHost hostform) {
		currentSession().save(hostform);
	}

	@Override
	public void update(ApplyHost hostform) {
		currentSession().update(hostform);
		
	}

	@Override
	public ApplyHost edit(Long hostFormId) {
		return find(hostFormId);
	}

	@Override
	public void delete(Long hostFormId) {
		Session session;
		ApplyHost hostform;

	    session = sessionFactory.getCurrentSession();
	    //session.delete(userId);
	    hostform = (ApplyHost)session.load(ApplyHost.class,hostFormId);
	    session.delete(hostform);
	    session.flush();
	}

	@Override
	public ApplyHost find(Long hostFormId) {
		return (ApplyHost)currentSession().get(ApplyHost.class,hostFormId);
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ApplyHost> getAll() {
		return currentSession().createCriteria(ApplyHost.class).list();
	}
	
	@Override
	public List<ApplyHost> findRole(){
		String hql = "from ApplyHost where 1=1";
        hql=hql+" and hostFormRole='"+1+"'";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        @SuppressWarnings("deprecation")
		List<ApplyHost> list=query.list();
        return list;
	}


}
