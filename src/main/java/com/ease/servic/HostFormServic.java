package com.ease.servic;

import java.util.List;

import com.ease.model.HostForm;

public interface HostFormServic {
	public void create(HostForm hostform) ;
	public void update(HostForm hostform) ;
	public HostForm edit(Long hostFormId);
	public void delete(Long hostFormId);
	public HostForm find(Long hostFormId) ;
	public List<HostForm> getAll() ;
	public List<HostForm> findRole();
	public List<HostForm> findGold();
}
