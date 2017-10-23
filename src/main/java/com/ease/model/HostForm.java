package com.ease.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HostForm")
public class HostForm {
	@Id
	@GeneratedValue
	private Long hostFormId;
	private String hostFormRole;
	private Long keyValue;
	
	//first page
	private String firstName;
	private String middleName;
	private String lastName;	
	private String title;
	private String age;
	private String maritalStatus;
	private String occupation;	
	private String cellphone;
	private String email;
	private String wayOfService;
	
	//second page
	private String address;
	private String country;	
	private String city;
	private String state;
	private String zipCode;	
	private String hosptial;
	private String supermarket;
	private String highschool;
	private String subwayStation;	
	private String university;
	private String busStation;	
	private String wifi;
	private String transportation;
	private String washhouse;
	private String breakfast;
	private String lunch;
	private String dinner;
	
	//third page
	private String familyMember1;
	private String age1;
	private String sex1;
	private String occupation1;	
	private String familyMember2;
	private String age2;	
	private String sex2;
	private String occupation2;
	private String familyMember3;
	private String age3;	
	private String sex3;
	private String occupation3;
	private String familyMember4;
	private String age4;	
	private String sex4;
	private String occupation4;
	
	//forth page
	private String introducation;
	private String religious;
	private String hostMembers;
	private String preferhost;	
	private String pets;
	
	//fifth page
	private String housePicture;	
	private String personPicture;
	private String drawingroomPicture;
	private String kitchenPicture;
	private String bothroomPicture;	
	private String bedroomPicture1_1;
	private String bedroomPicture1_2;	
	private String P1ShortTermStartTime;
	private String P1ShortTermLeftTime;
//	private String P1LongTermStartTime;
//	private String P1LongTermLeftTime;
	private String P1Price;
	private String bedroomPicture2_1;
	private String bedroomPicture2_2;
	private String P2ShortTermStartTime;
	private String P2ShortTermLeftTime;
//	private String P2LongTermStartTime;
//	private String P2LongTermLeftTime;
	private String P2Price;
	private String bedroomPicture3_1;
	private String bedroomPicture3_2;	
	private String P3ShortTermStartTime;
	private String P3ShortTermLeftTime;
//	private String P3LongTermStartTime;
//	private String P3LongTermLeftTime;
	private String P3Price;
	private String bedroomPicture4_1;
	private String bedroomPicture4_2;
	private String P4ShortTermStartTime;
	private String P4ShortTermLeftTime;
//	private String P4LongTermStartTime;
//	private String P4LongTermLeftTime;
	private String P4Price;
	private String bedroomPicture5_1;
	private String bedroomPicture5_2;
	private String P5ShortTermStartTime;
	private String P5ShortTermLeftTime;
//	private String P5LongTermStartTime;
//	private String P5LongTermLeftTime;
	private String P5Price;
	private String bedroomPicture6_1;
	private String bedroomPicture6_2;
	private String P6ShortTermStartTime;
	private String P6ShortTermLeftTime;
//	private String P6LongTermStartTime;
//	private String P6LongTermLeftTime;
	private String P6Price;
	private String bedroomPicture7_1;
	private String bedroomPicture7_2;
	private String P7ShortTermStartTime;
	private String P7ShortTermLeftTime;
//	private String P7LongTermStartTime;
//	private String P7LongTermLeftTime;
	private String P7Price;
	private String bedroomPicture8_1;
	private String bedroomPicture8_2;
	private String P8ShortTermStartTime;
	private String P8ShortTermLeftTime;
//	private String P8LongTermStartTime;
//	private String P8LongTermLeftTime;
	private String P8Price;
	private String bedroomPicture9_1;
	private String bedroomPicture9_2;
	private String P9ShortTermStartTime;
	private String P9ShortTermLeftTime;
//	private String P9LongTermStartTime;
//	private String P9LongTermLeftTime;
	private String P9Price;
	private String bedroomPicture10_1;
	private String bedroomPicture10_2;
	private String P10ShortTermStartTime;
	private String P10ShortTermLeftTime;
//	private String P10LongTermStartTime;
//	private String P10LongTermLeftTime;
	private String P10Price;
	public String getBedroomPicture8_1() {
		return bedroomPicture8_1;
	}
	public void setBedroomPicture8_1(String bedroomPicture8_1) {
		this.bedroomPicture8_1 = bedroomPicture8_1;
	}
	public String getBedroomPicture8_2() {
		return bedroomPicture8_2;
	}
	public void setBedroomPicture8_2(String bedroomPicture8_2) {
		this.bedroomPicture8_2 = bedroomPicture8_2;
	}
	public String getP8ShortTermStartTime() {
		return P8ShortTermStartTime;
	}
	public void setP8ShortTermStartTime(String p8ShortTermStartTime) {
		P8ShortTermStartTime = p8ShortTermStartTime;
	}
	public String getP8ShortTermLeftTime() {
		return P8ShortTermLeftTime;
	}
	public void setP8ShortTermLeftTime(String p8ShortTermLeftTime) {
		P8ShortTermLeftTime = p8ShortTermLeftTime;
	}
//	public String getP8LongTermStartTime() {
//		return P8LongTermStartTime;
//	}
//	public void setP8LongTermStartTime(String p8LongTermStartTime) {
//		P8LongTermStartTime = p8LongTermStartTime;
//	}
//	public String getP8LongTermLeftTime() {
//		return P8LongTermLeftTime;
//	}
//	public void setP8LongTermLeftTime(String p8LongTermLeftTime) {
//		P8LongTermLeftTime = p8LongTermLeftTime;
//	}
	public String getP8Price() {
		return P8Price;
	}
	public void setP8Price(String p8Price) {
		P8Price = p8Price;
	}
	public String getBedroomPicture9_1() {
		return bedroomPicture9_1;
	}
	public void setBedroomPicture9_1(String bedroomPicture9_1) {
		this.bedroomPicture9_1 = bedroomPicture9_1;
	}
	public String getBedroomPicture9_2() {
		return bedroomPicture9_2;
	}
	public void setBedroomPicture9_2(String bedroomPicture9_2) {
		this.bedroomPicture9_2 = bedroomPicture9_2;
	}
	public String getP9ShortTermStartTime() {
		return P9ShortTermStartTime;
	}
	public void setP9ShortTermStartTime(String p9ShortTermStartTime) {
		P9ShortTermStartTime = p9ShortTermStartTime;
	}
	public String getP9ShortTermLeftTime() {
		return P9ShortTermLeftTime;
	}
	public void setP9ShortTermLeftTime(String p9ShortTermLeftTime) {
		P9ShortTermLeftTime = p9ShortTermLeftTime;
	}
//	public String getP9LongTermStartTime() {
//		return P9LongTermStartTime;
//	}
//	public void setP9LongTermStartTime(String p9LongTermStartTime) {
//		P9LongTermStartTime = p9LongTermStartTime;
//	}
//	public String getP9LongTermLeftTime() {
//		return P9LongTermLeftTime;
//	}
//	public void setP9LongTermLeftTime(String p9LongTermLeftTime) {
//		P9LongTermLeftTime = p9LongTermLeftTime;
//	}
	public String getP9Price() {
		return P9Price;
	}
	public void setP9Price(String p9Price) {
		P9Price = p9Price;
	}
	public String getBedroomPicture10_1() {
		return bedroomPicture10_1;
	}
	public void setBedroomPicture10_1(String bedroomPicture10_1) {
		this.bedroomPicture10_1 = bedroomPicture10_1;
	}
	public String getBedroomPicture10_2() {
		return bedroomPicture10_2;
	}
	public void setBedroomPicture10_2(String bedroomPicture10_2) {
		this.bedroomPicture10_2 = bedroomPicture10_2;
	}
	public String getP10ShortTermStartTime() {
		return P10ShortTermStartTime;
	}
	public void setP10ShortTermStartTime(String p10ShortTermStartTime) {
		P10ShortTermStartTime = p10ShortTermStartTime;
	}
	public String getP10ShortTermLeftTime() {
		return P10ShortTermLeftTime;
	}
	public void setP10ShortTermLeftTime(String p10ShortTermLeftTime) {
		P10ShortTermLeftTime = p10ShortTermLeftTime;
	}
//	public String getP10LongTermStartTime() {
//		return P10LongTermStartTime;
//	}
//	public void setP10LongTermStartTime(String p10LongTermStartTime) {
//		P10LongTermStartTime = p10LongTermStartTime;
//	}
//	public String getP10LongTermLeftTime() {
//		return P10LongTermLeftTime;
//	}
//	public void setP10LongTermLeftTime(String p10LongTermLeftTime) {
//		P10LongTermLeftTime = p10LongTermLeftTime;
//	}
	public String getP10Price() {
		return P10Price;
	}
	public void setP10Price(String p10Price) {
		P10Price = p10Price;
	}
	

	
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	public String getWashhouse() {
		return washhouse;
	}
	public void setWashhouse(String washhouse) {
		this.washhouse = washhouse;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	
	
	public String getFamilyMember4() {
		return familyMember4;
	}
	public void setFamilyMember4(String familyMember4) {
		this.familyMember4 = familyMember4;
	}
	public String getAge4() {
		return age4;
	}
	public void setAge4(String age4) {
		this.age4 = age4;
	}
	public String getSex4() {
		return sex4;
	}
	public void setSex4(String sex4) {
		this.sex4 = sex4;
	}
	public String getOccupation4() {
		return occupation4;
	}
	public void setOccupation4(String occupation4) {
		this.occupation4 = occupation4;
	}
	public String getBedroomPicture5_1() {
		return bedroomPicture5_1;
	}
	public void setBedroomPicture5_1(String bedroomPicture5_1) {
		this.bedroomPicture5_1 = bedroomPicture5_1;
	}
	public String getBedroomPicture5_2() {
		return bedroomPicture5_2;
	}
	public void setBedroomPicture5_2(String bedroomPicture5_2) {
		this.bedroomPicture5_2 = bedroomPicture5_2;
	}
	public String getP5ShortTermStartTime() {
		return P5ShortTermStartTime;
	}
	public void setP5ShortTermStartTime(String p5ShortTermStartTime) {
		P5ShortTermStartTime = p5ShortTermStartTime;
	}
	public String getP5ShortTermLeftTime() {
		return P5ShortTermLeftTime;
	}
	public void setP5ShortTermLeftTime(String p5ShortTermLeftTime) {
		P5ShortTermLeftTime = p5ShortTermLeftTime;
	}
//	public String getP5LongTermStartTime() {
//		return P5LongTermStartTime;
//	}
//	public void setP5LongTermStartTime(String p5LongTermStartTime) {
//		P5LongTermStartTime = p5LongTermStartTime;
//	}
//	public String getP5LongTermLeftTime() {
//		return P5LongTermLeftTime;
//	}
//	public void setP5LongTermLeftTime(String p5LongTermLeftTime) {
//		P5LongTermLeftTime = p5LongTermLeftTime;
//	}
	public String getP5Price() {
		return P5Price;
	}
	public void setP5Price(String p5Price) {
		P5Price = p5Price;
	}
	public String getBedroomPicture6_1() {
		return bedroomPicture6_1;
	}
	public void setBedroomPicture6_1(String bedroomPicture6_1) {
		this.bedroomPicture6_1 = bedroomPicture6_1;
	}
	public String getBedroomPicture6_2() {
		return bedroomPicture6_2;
	}
	public void setBedroomPicture6_2(String bedroomPicture6_2) {
		this.bedroomPicture6_2 = bedroomPicture6_2;
	}
	public String getP6ShortTermStartTime() {
		return P6ShortTermStartTime;
	}
	public void setP6ShortTermStartTime(String p6ShortTermStartTime) {
		P6ShortTermStartTime = p6ShortTermStartTime;
	}
	public String getP6ShortTermLeftTime() {
		return P6ShortTermLeftTime;
	}
	public void setP6ShortTermLeftTime(String p6ShortTermLeftTime) {
		P6ShortTermLeftTime = p6ShortTermLeftTime;
	}
//	public String getP6LongTermStartTime() {
//		return P6LongTermStartTime;
//	}
//	public void setP6LongTermStartTime(String p6LongTermStartTime) {
//		P6LongTermStartTime = p6LongTermStartTime;
//	}
//	public String getP6LongTermLeftTime() {
//		return P6LongTermLeftTime;
//	}
//	public void setP6LongTermLeftTime(String p6LongTermLeftTime) {
//		P6LongTermLeftTime = p6LongTermLeftTime;
//	}
	public String getP6Price() {
		return P6Price;
	}
	public void setP6Price(String p6Price) {
		P6Price = p6Price;
	}
	public String getBedroomPicture7_1() {
		return bedroomPicture7_1;
	}
	public void setBedroomPicture7_1(String bedroomPicture7_1) {
		this.bedroomPicture7_1 = bedroomPicture7_1;
	}
	public String getBedroomPicture7_2() {
		return bedroomPicture7_2;
	}
	public void setBedroomPicture7_2(String bedroomPicture7_2) {
		this.bedroomPicture7_2 = bedroomPicture7_2;
	}
	public String getP7ShortTermStartTime() {
		return P7ShortTermStartTime;
	}
	public void setP7ShortTermStartTime(String p7ShortTermStartTime) {
		P7ShortTermStartTime = p7ShortTermStartTime;
	}
	public String getP7ShortTermLeftTime() {
		return P7ShortTermLeftTime;
	}
	public void setP7ShortTermLeftTime(String p7ShortTermLeftTime) {
		P7ShortTermLeftTime = p7ShortTermLeftTime;
	}
//	public String getP7LongTermStartTime() {
//		return P7LongTermStartTime;
//	}
//	public void setP7LongTermStartTime(String p7LongTermStartTime) {
//		P7LongTermStartTime = p7LongTermStartTime;
//	}
//	public String getP7LongTermLeftTime() {
//		return P7LongTermLeftTime;
//	}
//	public void setP7LongTermLeftTime(String p7LongTermLeftTime) {
//		P7LongTermLeftTime = p7LongTermLeftTime;
//	}
	public String getP7Price() {
		return P7Price;
	}
	public void setP7Price(String p7Price) {
		P7Price = p7Price;
	}
	

	public String getP1Price() {
		return P1Price;
	}
	public void setP1Price(String p1Price) {
		P1Price = p1Price;
	}
	public String getP2Price() {
		return P2Price;
	}
	public void setP2Price(String p2Price) {
		P2Price = p2Price;
	}
	public String getP3Price() {
		return P3Price;
	}
	public void setP3Price(String p3Price) {
		P3Price = p3Price;
	}
	public String getP4Price() {
		return P4Price;
	}
	public void setP4Price(String p4Price) {
		P4Price = p4Price;
	}
	public Long getHostFormId() {
		return hostFormId;
	}
	public void setHostFormId(Long hostFormId) {
		this.hostFormId = hostFormId;
	}
	public String getHostFormRole() {
		return hostFormRole;
	}
	public void setHostFormRole(String hostFormRole) {
		this.hostFormRole = hostFormRole;
	}
	
	
	/*public Long getKeyValue() {
		return keyValue;
	}
	public void setKeyValue(Long keyValue) {
		this.keyValue = keyValue;
	}*/
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWayOfService() {
		return wayOfService;
	}
	public void setWayOfService(String wayOfService) {
		this.wayOfService = wayOfService;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getHosptial() {
		return hosptial;
	}
	public void setHosptial(String hosptial) {
		this.hosptial = hosptial;
	}
	public String getSupermarket() {
		return supermarket;
	}
	public void setSupermarket(String supermarket) {
		this.supermarket = supermarket;
	}
	public String getHighschool() {
		return highschool;
	}
	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}
	public String getSubwayStation() {
		return subwayStation;
	}
	public void setSubwayStation(String subwayStation) {
		this.subwayStation = subwayStation;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getBusStation() {
		return busStation;
	}
	public void setBusStation(String busStation) {
		this.busStation = busStation;
	}
	public String getFamilyMember1() {
		return familyMember1;
	}
	public void setFamilyMember1(String familyMember1) {
		this.familyMember1 = familyMember1;
	}
	public String getAge1() {
		return age1;
	}
	public void setAge1(String age1) {
		this.age1 = age1;
	}
	public String getSex1() {
		return sex1;
	}
	public void setSex1(String sex1) {
		this.sex1 = sex1;
	}
	public String getOccupation1() {
		return occupation1;
	}
	public void setOccupation1(String occupation1) {
		this.occupation1 = occupation1;
	}
	public String getFamilyMember2() {
		return familyMember2;
	}
	public void setFamilyMember2(String familyMember2) {
		this.familyMember2 = familyMember2;
	}
	public String getAge2() {
		return age2;
	}
	public void setAge2(String age2) {
		this.age2 = age2;
	}
	public String getSex2() {
		return sex2;
	}
	public void setSex2(String sex2) {
		this.sex2 = sex2;
	}
	public String getOccupation2() {
		return occupation2;
	}
	public void setOccupation2(String occupation2) {
		this.occupation2 = occupation2;
	}
	public String getFamilyMember3() {
		return familyMember3;
	}
	public void setFamilyMember3(String familyMember3) {
		this.familyMember3 = familyMember3;
	}
	public String getAge3() {
		return age3;
	}
	public void setAge3(String age3) {
		this.age3 = age3;
	}
	public String getSex3() {
		return sex3;
	}
	public void setSex3(String sex3) {
		this.sex3 = sex3;
	}
	public String getOccupation3() {
		return occupation3;
	}
	public void setOccupation3(String occupation3) {
		this.occupation3 = occupation3;
	}
	public String getHostMembers() {
		return hostMembers;
	}
	public void setHostMembers(String hostMembers) {
		this.hostMembers = hostMembers;
	}
	public String getIntroducation() {
		return introducation;
	}
	public void setIntroducation(String introducation) {
		this.introducation = introducation;
	}
	public String getPreferhost() {
		return preferhost;
	}
	public void setPreferhost(String preferhost) {
		this.preferhost = preferhost;
	}
	public String getReligious() {
		return religious;
	}
	public void setReligious(String religious) {
		this.religious = religious;
	}
	public String getPets() {
		return pets;
	}
	public void setPets(String pets) {
		this.pets = pets;
	}
	public String getHousePicture() {
		return housePicture;
	}
	public void setHousePicture(String housePicture) {
		this.housePicture = housePicture;
	}
	public String getPersonPicture() {
		return personPicture;
	}
	public void setPersonPicture(String personPicture) {
		this.personPicture = personPicture;
	}
	public String getDrawingroomPicture() {
		return drawingroomPicture;
	}
	public void setDrawingroomPicture(String drawingroomPicture) {
		this.drawingroomPicture = drawingroomPicture;
	}
	public String getKitchenPicture() {
		return kitchenPicture;
	}
	public void setKitchenPicture(String kitchenPicture) {
		this.kitchenPicture = kitchenPicture;
	}
	public String getBothroomPicture() {
		return bothroomPicture;
	}
	public void setBothroomPicture(String bothroomPicture) {
		this.bothroomPicture = bothroomPicture;
	}
	public String getBedroomPicture1_1() {
		return bedroomPicture1_1;
	}
	public void setBedroomPicture1_1(String bedroomPicture1_1) {
		this.bedroomPicture1_1 = bedroomPicture1_1;
	}
	public String getBedroomPicture1_2() {
		return bedroomPicture1_2;
	}
	public void setBedroomPicture1_2(String bedroomPicture1_2) {
		this.bedroomPicture1_2 = bedroomPicture1_2;
	}
	public String getBedroomPicture2_1() {
		return bedroomPicture2_1;
	}
	public void setBedroomPicture2_1(String bedroomPicture2_1) {
		this.bedroomPicture2_1 = bedroomPicture2_1;
	}
	public String getBedroomPicture2_2() {
		return bedroomPicture2_2;
	}
	public void setBedroomPicture2_2(String bedroomPicture2_2) {
		this.bedroomPicture2_2 = bedroomPicture2_2;
	}
	public String getBedroomPicture3_1() {
		return bedroomPicture3_1;
	}
	public void setBedroomPicture3_1(String bedroomPicture3_1) {
		this.bedroomPicture3_1 = bedroomPicture3_1;
	}
	public String getBedroomPicture3_2() {
		return bedroomPicture3_2;
	}
	public void setBedroomPicture3_2(String bedroomPicture3_2) {
		this.bedroomPicture3_2 = bedroomPicture3_2;
	}
	public String getBedroomPicture4_1() {
		return bedroomPicture4_1;
	}
	public void setBedroomPicture4_1(String bedroomPicture4_1) {
		this.bedroomPicture4_1 = bedroomPicture4_1;
	}
	public String getBedroomPicture4_2() {
		return bedroomPicture4_2;
	}
	public void setBedroomPicture4_2(String bedroomPicture4_2) {
		this.bedroomPicture4_2 = bedroomPicture4_2;
	}
	public String getP1ShortTermStartTime() {
		return P1ShortTermStartTime;
	}
	public void setP1ShortTermStartTime(String p1ShortTermStartTime) {
		P1ShortTermStartTime = p1ShortTermStartTime;
	}
	public String getP1ShortTermLeftTime() {
		return P1ShortTermLeftTime;
	}
	public void setP1ShortTermLeftTime(String p1ShortTermLeftTime) {
		P1ShortTermLeftTime = p1ShortTermLeftTime;
	}
//	public String getP1LongTermStartTime() {
//		return P1LongTermStartTime;
//	}
//	public void setP1LongTermStartTime(String p1LongTermStartTime) {
//		P1LongTermStartTime = p1LongTermStartTime;
//	}
//	public String getP1LongTermLeftTime() {
//		return P1LongTermLeftTime;
//	}
//	public void setP1LongTermLeftTime(String p1LongTermLeftTime) {
//		P1LongTermLeftTime = p1LongTermLeftTime;
//	}
	public String getP2ShortTermStartTime() {
		return P2ShortTermStartTime;
	}
	public void setP2ShortTermStartTime(String p2ShortTermStartTime) {
		P2ShortTermStartTime = p2ShortTermStartTime;
	}
	public String getP2ShortTermLeftTime() {
		return P2ShortTermLeftTime;
	}
	public void setP2ShortTermLeftTime(String p2ShortTermLeftTime) {
		P2ShortTermLeftTime = p2ShortTermLeftTime;
	}
//	public String getP2LongTermStartTime() {
//		return P2LongTermStartTime;
//	}
//	public void setP2LongTermStartTime(String p2LongTermStartTime) {
//		P2LongTermStartTime = p2LongTermStartTime;
//	}
//	public String getP2LongTermLeftTime() {
//		return P2LongTermLeftTime;
//	}
//	public void setP2LongTermLeftTime(String p2LongTermLeftTime) {
//		P2LongTermLeftTime = p2LongTermLeftTime;
//	}
	public String getP3ShortTermStartTime() {
		return P3ShortTermStartTime;
	}
	public void setP3ShortTermStartTime(String p3ShortTermStartTime) {
		P3ShortTermStartTime = p3ShortTermStartTime;
	}
	public String getP3ShortTermLeftTime() {
		return P3ShortTermLeftTime;
	}
	public void setP3ShortTermLeftTime(String p3ShortTermLeftTime) {
		P3ShortTermLeftTime = p3ShortTermLeftTime;
	}
//	public String getP3LongTermStartTime() {
//		return P3LongTermStartTime;
//	}
//	public void setP3LongTermStartTime(String p3LongTermStartTime) {
//		P3LongTermStartTime = p3LongTermStartTime;
//	}
//	public String getP3LongTermLeftTime() {
//		return P3LongTermLeftTime;
//	}
//	public void setP3LongTermLeftTime(String p3LongTermLeftTime) {
//		P3LongTermLeftTime = p3LongTermLeftTime;
//	}
	public String getP4ShortTermStartTime() {
		return P4ShortTermStartTime;
	}
	public void setP4ShortTermStartTime(String p4ShortTermStartTime) {
		P4ShortTermStartTime = p4ShortTermStartTime;
	}
	public String getP4ShortTermLeftTime() {
		return P4ShortTermLeftTime;
	}
	public void setP4ShortTermLeftTime(String p4ShortTermLeftTime) {
		P4ShortTermLeftTime = p4ShortTermLeftTime;
	}
//	public String getP4LongTermStartTime() {
//		return P4LongTermStartTime;
//	}
//	public void setP4LongTermStartTime(String p4LongTermStartTime) {
//		P4LongTermStartTime = p4LongTermStartTime;
//	}
//	public String getP4LongTermLeftTime() {
//		return P4LongTermLeftTime;
//	}
//	public void setP4LongTermLeftTime(String p4LongTermLeftTime) {
//		P4LongTermLeftTime = p4LongTermLeftTime;
//	}
	public Long getKeyValue() {
		return keyValue;
	}
	public void setKeyValue(Long keyValue) {
		this.keyValue = keyValue;
	}
	


}
