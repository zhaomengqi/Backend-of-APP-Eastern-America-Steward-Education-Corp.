package com.ease.doa;

import java.util.List;
import com.ease.model.HostForm;


public interface HostFormDao {

	public void create(HostForm hostform) ;
	public void update(HostForm hostform) ;
	public HostForm edit(Long hostFormId);
	public void delete(Long hostFormId);
	public HostForm find(Long hostFormId) ;
	public List<HostForm> getAll() ;
	public List<HostForm> findRole();
	public List<HostForm> findGold();
}
