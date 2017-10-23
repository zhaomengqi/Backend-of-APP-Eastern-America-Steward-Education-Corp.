package com.ease.doa;

import java.util.List;

import com.ease.model.ApplyHost;

public interface ApplyHostDao {

	public void create(ApplyHost hostform) ;
	public void update(ApplyHost hostform) ;
	public ApplyHost edit(Long hostFormId);
	public void delete(Long hostFormId);
	public ApplyHost find(Long hostFormId) ;
	public List<ApplyHost> getAll() ;
	public List<ApplyHost> findRole();
}
