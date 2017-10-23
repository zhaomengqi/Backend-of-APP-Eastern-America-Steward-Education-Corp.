package com.ease.controller;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ease.model.HostForm;
import com.ease.model.ApplyHost;
import com.ease.servic.ApplyHostServic;
import com.ease.servic.HostFormServic;


public class MyTask implements Serializable {
	 private static final long serialVersionUID = 1L; 
	
	@Autowired 
	ApplyHostServic applyHostService;
	@Autowired 
	HostFormServic hostformService;
	
	
	public void doTask() {
		List<HostForm> hosts = hostformService.findRole();
		ApplyHost temp = new ApplyHost();
		for(HostForm hosti:hosts){
			if(applyHostService.find(hosti.getHostFormId()) != null){
				continue;
			}
			else{
			temp.setHostFormId(hosti.getHostFormId());
			temp.setHostFormRole(hosti.getHostFormRole());
			temp.setKeyValue(hosti.getKeyValue());
			temp.setFirstName(hosti.getFirstName());
			temp.setMiddleName(hosti.getMiddleName());
			temp.setLastName(hosti.getLastName());
			temp.setTitle(hosti.getTitle());
			temp.setAge(hosti.getAge());
			temp.setMaritalStatus(hosti.getMaritalStatus());
			temp.setOccupation(hosti.getOccupation());
			temp.setCellphone(hosti.getCellphone());
			temp.setEmail(hosti.getEmail());
			temp.setWayOfService(hosti.getWayOfService());
			temp.setCountry(hosti.getCountry());
			temp.setAddress(hosti.getAddress());
			temp.setCity(hosti.getCity());
			temp.setState(hosti.getState());
			temp.setZipCode(hosti.getZipCode());
			temp.setHosptial(hosti.getHosptial());
			temp.setSupermarket(hosti.getSupermarket());
			temp.setHighschool(hosti.getHighschool());
			temp.setSubwayStation(hosti.getSubwayStation());
			temp.setUniversity(hosti.getUniversity());
			temp.setBusStation(hosti.getBusStation());
			temp.setWifi(hosti.getWifi());
			temp.setTransportation(hosti.getTransportation());
			temp.setWashhouse(hosti.getWashhouse());
			temp.setBreakfast(hosti.getBreakfast());
			temp.setLunch(hosti.getLunch());
			temp.setDinner(hosti.getDinner());
			temp.setFamilyMember1(hosti.getFamilyMember1());
			temp.setAge1(hosti.getAge1());
			temp.setSex1(hosti.getSex1());
			temp.setOccupation1(hosti.getOccupation1());
			temp.setFamilyMember2(hosti.getFamilyMember2());
			temp.setAge2(hosti.getAge2());
			temp.setSex2(hosti.getSex2());
			temp.setOccupation2(hosti.getOccupation2());
			temp.setFamilyMember3(hosti.getFamilyMember3());
			temp.setAge3(hosti.getAge3());
			temp.setSex3(hosti.getSex3());
			temp.setOccupation3(hosti.getOccupation3());
			temp.setFamilyMember4(hosti.getFamilyMember4());
			temp.setAge4(hosti.getAge4());
			temp.setSex4(hosti.getSex4());
			temp.setOccupation4(hosti.getOccupation4());
			temp.setHostMembers(hosti.getHostMembers());
			temp.setIntroducation(hosti.getIntroducation());
			temp.setPreferhost(hosti.getPreferhost());
			temp.setReligious(hosti.getReligious());
			temp.setPets(hosti.getPets());
			temp.setPersonPicture(hosti.getPersonPicture());
			temp.setDrawingroomPicture(hosti.getDrawingroomPicture());
			temp.setKitchenPicture(hosti.getKitchenPicture());
			temp.setBothroomPicture(hosti.getBothroomPicture());
			temp.setBedroomPicture1_1(hosti.getBedroomPicture1_1());
			temp.setBedroomPicture1_2(hosti.getBedroomPicture1_2());
			temp.setP1ShortTermStartTime(hosti.getP1ShortTermStartTime());
			temp.setP1ShortTermLeftTime(hosti.getP1ShortTermLeftTime());
//			temp.setP1LongTermStartTime(hosti.getP1LongTermStartTime());
//			temp.setP1LongTermLeftTime(hosti.getP1LongTermLeftTime());
			temp.setBedroomPicture2_1(hosti.getBedroomPicture2_1());
			temp.setBedroomPicture2_2(hosti.getBedroomPicture2_2());
			temp.setP2ShortTermStartTime(hosti.getP2ShortTermStartTime());
			temp.setP2ShortTermLeftTime(hosti.getP2ShortTermLeftTime());
//			temp.setP2LongTermStartTime(hosti.getP2LongTermStartTime());
//			temp.setP2LongTermLeftTime(hosti.getP2LongTermLeftTime());
			temp.setBedroomPicture3_1(hosti.getBedroomPicture3_1());
			temp.setBedroomPicture3_2(hosti.getBedroomPicture3_2());
			temp.setP3ShortTermStartTime(hosti.getP3ShortTermStartTime());
			temp.setP3ShortTermLeftTime(hosti.getP3ShortTermLeftTime());
//			temp.setP3LongTermStartTime(hosti.getP3LongTermStartTime());
//			temp.setP3LongTermLeftTime(hosti.getP3LongTermLeftTime());
			temp.setBedroomPicture4_1(hosti.getBedroomPicture4_1());
			temp.setBedroomPicture4_2(hosti.getBedroomPicture4_2());
			temp.setP4ShortTermStartTime(hosti.getP4ShortTermStartTime());
			temp.setP4ShortTermLeftTime(hosti.getP4ShortTermLeftTime());
//			temp.setP4LongTermStartTime(hosti.getP4LongTermStartTime());
//			temp.setP4LongTermLeftTime(hosti.getP4LongTermLeftTime());
			temp.setP1Price(hosti.getP1Price());
			temp.setP2Price(hosti.getP2Price());
			temp.setP3Price(hosti.getP3Price());
			temp.setP4Price(hosti.getP4Price());
			temp.setP5Price(hosti.getP5Price());
			temp.setP6Price(hosti.getP6Price());
			temp.setP7Price(hosti.getP7Price());
			temp.setP8Price(hosti.getP8Price());
			temp.setP9Price(hosti.getP9Price());
			temp.setP10Price(hosti.getP10Price());
			temp.setBedroomPicture5_1(hosti.getBedroomPicture5_1());
			temp.setBedroomPicture5_2(hosti.getBedroomPicture5_2());
			temp.setP5ShortTermStartTime(hosti.getP5ShortTermStartTime());
			temp.setP5ShortTermLeftTime(hosti.getP5ShortTermLeftTime());
//			temp.setP5LongTermStartTime(hosti.getP5LongTermStartTime());
//			temp.setP5LongTermLeftTime(hosti.getP5LongTermLeftTime());
			
			temp.setBedroomPicture6_1(hosti.getBedroomPicture6_1());
			temp.setBedroomPicture6_2(hosti.getBedroomPicture6_2());
			temp.setP6ShortTermStartTime(hosti.getP6ShortTermStartTime());
			temp.setP6ShortTermLeftTime(hosti.getP6ShortTermLeftTime());
//			temp.setP6LongTermStartTime(hosti.getP6LongTermStartTime());
//			temp.setP6LongTermLeftTime(hosti.getP6LongTermLeftTime());
			
			temp.setBedroomPicture7_1(hosti.getBedroomPicture7_1());
			temp.setBedroomPicture7_2(hosti.getBedroomPicture7_2());
			temp.setP7ShortTermStartTime(hosti.getP7ShortTermStartTime());
			temp.setP7ShortTermLeftTime(hosti.getP7ShortTermLeftTime());
//			temp.setP7LongTermStartTime(hosti.getP7LongTermStartTime());
//			temp.setP7LongTermLeftTime(hosti.getP7LongTermLeftTime());
			
			temp.setBedroomPicture8_1(hosti.getBedroomPicture8_1());
			temp.setBedroomPicture8_2(hosti.getBedroomPicture8_2());
			temp.setP8ShortTermStartTime(hosti.getP8ShortTermStartTime());
			temp.setP8ShortTermLeftTime(hosti.getP8ShortTermLeftTime());
//			temp.setP8LongTermStartTime(hosti.getP8LongTermStartTime());
//			temp.setP8LongTermLeftTime(hosti.getP8LongTermLeftTime());
			
			temp.setBedroomPicture9_1(hosti.getBedroomPicture9_1());
			temp.setBedroomPicture9_2(hosti.getBedroomPicture9_2());
			temp.setP9ShortTermStartTime(hosti.getP9ShortTermStartTime());
			temp.setP9ShortTermLeftTime(hosti.getP9ShortTermLeftTime());
//			temp.setP9LongTermStartTime(hosti.getP9LongTermStartTime());
//			temp.setP9LongTermLeftTime(hosti.getP9LongTermLeftTime());
			
			temp.setBedroomPicture10_1(hosti.getBedroomPicture10_1());
			temp.setBedroomPicture10_2(hosti.getBedroomPicture10_2());
			temp.setP10ShortTermStartTime(hosti.getP10ShortTermStartTime());
			temp.setP10ShortTermLeftTime(hosti.getP10ShortTermLeftTime());
//			temp.setP10LongTermStartTime(hosti.getP10LongTermStartTime());
//			temp.setP10LongTermLeftTime(hosti.getP10LongTermLeftTime());
			applyHostService.create(temp);
			}
		}
		System.out.println("Current Time THONGGGGGGGGGGGGGG : "	+ Calendar.getInstance().getTime());
		
	}
}
