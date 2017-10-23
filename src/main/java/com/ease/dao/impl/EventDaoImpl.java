package com.ease.dao.impl;

import java.util.List;
import com.ease.doa.EventDao;
import com.ease.model.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("eventDao")
public class EventDaoImpl implements EventDao {

	@Autowired
	SessionFactory sessionFactory;
	protected Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(Event event) {
		currentSession().save(event);
	}

	@Override
	public void update(Event event) {
		currentSession().update(event);
	}

	@Override
	public Event edit(Long eventId) {
		return find(eventId);
	}

	@Override
	public void delete(Long eventId) {
		Session session;
	    Event event;

	    session = sessionFactory.getCurrentSession();
	    //session.delete(userId);
	    event = (Event)session.load(Event.class,eventId);
	    session.delete(event);
	    session.flush() ;

	}

	@Override
	public Event find(Long eventId) {
		return (Event)currentSession().get(Event.class,eventId);
	}

	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Event> getAll() {
		 return currentSession().createCriteria(Event.class).list();
	}

}

