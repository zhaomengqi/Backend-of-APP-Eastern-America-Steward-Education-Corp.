package com.ease.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ease.doa.ApplyHostDao;
import com.ease.model.ApplyHost;
import com.ease.servic.ApplyHostServic;


@Service("applyHostService")
@Transactional(rollbackFor = Exception.class)

public class ApplyHostServiceImpl implements ApplyHostServic{


	@Autowired
	ApplyHostDao applyHostDao;
	
	@Override
	public void create(ApplyHost hostform) {
		applyHostDao.create(hostform);
	}

	@Override
	public void update(ApplyHost hostform) {
		applyHostDao.update(hostform);
	}

	@Override
	public ApplyHost edit(Long hostFormId) {
		return applyHostDao.edit(hostFormId);
	}

	@Override
	public void delete(Long hostFormId) {
		applyHostDao.delete(hostFormId);
	}

	@Override
	public ApplyHost find(Long hostFormId) {
		return applyHostDao.find(hostFormId);
	}

	@Override
	public List<ApplyHost> getAll() {
		return applyHostDao.getAll();
	}

	@Override
	public List<ApplyHost> findRole() {
		return applyHostDao.findRole();
	}
	
	
}
