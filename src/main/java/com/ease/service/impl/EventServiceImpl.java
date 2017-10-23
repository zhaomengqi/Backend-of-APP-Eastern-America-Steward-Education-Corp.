package com.ease.service.impl;

import java.util.List;

import com.ease.doa.EventDao;
import com.ease.model.Event;
import com.ease.servic.EventServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("eventService")
@Transactional(rollbackFor = Exception.class)
public class EventServiceImpl implements EventServic{

	@Autowired
	EventDao eventDao;
	@Override
	public void create(Event event) {
		eventDao.create(event);
	}

	@Override
	public void update(Event event) {
		eventDao.update(event);
	}

	@Override
	public Event edit(Long eventId) {
		return eventDao.edit(eventId);
	}

	@Override
	public void delete(Long eventId) {
		eventDao.delete(eventId);
	}

	@Override
	public Event find(Long eventId) {
		return eventDao.find(eventId);
	}

	@Override
	public List<Event> getAll() {
		return eventDao.getAll();
	}

}
