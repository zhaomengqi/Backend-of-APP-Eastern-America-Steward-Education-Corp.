package com.ease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ease.doa.HostFormDao;
import com.ease.model.HostForm;
import com.ease.servic.HostFormServic;

@Service("hostformService")
@Transactional(rollbackFor = Exception.class)

public class HostServiceImpl implements HostFormServic  {

	@Autowired
	HostFormDao hostformDao;
	
	
	@Override
	public void create(HostForm hostform) {
		hostformDao.create(hostform);
		
	}

	@Override
	public void update(HostForm hostform) {
		hostformDao.update(hostform);
	}

	@Override
	public HostForm edit(Long hostFormId) {
		return hostformDao.edit(hostFormId);
	}

	@Override
	public void delete(Long hostFormId) {
		hostformDao.delete(hostFormId);
	}

	@Override
	public HostForm find(Long hostFormId) {
		return hostformDao.find(hostFormId);
	}

	@Override
	public List<HostForm> getAll() {
		return hostformDao.getAll();
	}

	@Override
	public List<HostForm> findRole(){
		return hostformDao.findRole();
	}
	
	@Override
	public List<HostForm> findGold(){
		return hostformDao.findGold();
	}
}
