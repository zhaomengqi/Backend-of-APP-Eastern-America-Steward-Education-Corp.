package com.ease.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ease.model.HostForm;
import com.ease.servic.ApplyHostServic;
import com.ease.servic.HostFormServic;

@Controller
@RequestMapping("/form")
public class HostFormController {
	
	@Autowired
	HostFormServic hostformService;
	@Autowired
	ApplyHostServic applyHostServic;
	

	@RequestMapping(value="/host1",method={RequestMethod.GET,RequestMethod.POST}) 
	public @ResponseBody HostForm Upload1(@RequestBody HostForm hostform,Map<String,Object> map){
		hostform.setHostFormRole("0");
		
		//set value in keyValue with time and random number
		//Date date = new Date();
		//Long m=date.getTime();
        //Double time=Math.random()*1000;
        //long l = new Double(time).longValue();
	    //System.out.println(date);
	    //System.out.println(m+l);
	    hostformService.create(hostform);
	    
		return hostform;
	}
	
	//test controller
	@RequestMapping(value="/host2",method={RequestMethod.GET,RequestMethod.POST}) 
	public @ResponseBody HostForm Upload2 (@RequestBody HostForm hostform,Map<String,Object> map){
		hostform.setHostFormRole("1");
		hostformService.create(hostform);
		System.out.println("5page");
		
		return hostform;
	}
	
	//test controller
	@RequestMapping(value="/host3",method={RequestMethod.GET,RequestMethod.POST}) 
	public String Upload3 (HostForm hostform,Map<String,Object> map){

		return "ok";
	}
	
	
	@RequestMapping(value=("/host4"),method={RequestMethod.GET,RequestMethod.POST})
	public String doUploadPage (@RequestParam("file")MultipartFile file,@RequestParam("file2")MultipartFile file2,@RequestParam("file3")MultipartFile file3,@RequestParam("file4")MultipartFile file4, @RequestParam("file5")MultipartFile file5, @RequestParam("file6")MultipartFile file6, 
			@RequestParam("file7")MultipartFile file7, @RequestParam("file8")MultipartFile file8, @RequestParam("file9")MultipartFile file9, @RequestParam("file10")MultipartFile file10, @RequestBody HostForm hostform)throws IOException{
           if(!file.isEmpty()&&!file2.isEmpty()){
        	   
//        	   Random rand=new Random();
//        	   long random=rand.nextInt();
//        	   String N="T"+System.currentTimeMillis()+random;
//        	   String time ="http://106.14.198.192:8080/pic/"+N;
//        	   System.out.println(time);
        	   
        	   //save picture in server
        	   String newName=System.currentTimeMillis()+file.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName));
        	   String newName2=System.currentTimeMillis()+file2.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file2.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName2));
        	   String newName3=System.currentTimeMillis()+file3.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file3.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName3));
        	   String newName4=System.currentTimeMillis()+file4.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file4.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName4));
        	   String newName5=System.currentTimeMillis()+file5.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file5.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName5));
        	   String newName6=System.currentTimeMillis()+file6.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file6.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName6));
        	   
        	   String newName7=System.currentTimeMillis()+file7.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file7.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName7));
        	   String newName8=System.currentTimeMillis()+file8.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file8.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName8));
        	   String newName9=System.currentTimeMillis()+file9.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file9.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName9));
        	   String newName10=System.currentTimeMillis()+file10.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file10.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName10));
        	   
        	   
        	   
        	   //print url of picture form server
        	   String time ="http://localhost:8080/pic/"+newName;
        	   System.out.println(time);
        	   String time2 ="http://localhost:8080/pic/"+newName2;
        	   System.out.println(time2);
        	   String time3 ="http://localhost:8080/pic/"+newName3;
        	   System.out.println(time3);
        	   String time4 ="http://localhost:8080/pic/"+newName4;
        	   System.out.println(time4);
        	   String time5 ="http://localhost:8080/pic/"+newName5;
        	   System.out.println(time5);
        	   
        	   String time6 ="http://localhost:8080/pic/"+newName6;
        	   System.out.println(time6);
        	   String time7 ="http://localhost:8080/pic/"+newName7;
        	   System.out.println(time7);
        	   String time8 ="http://localhost:8080/pic/"+newName8;
        	   System.out.println(time8);
        	   String time9 ="http://localhost:8080/pic/"+newName9;
        	   System.out.println(time9);
        	   String time10 ="http://localhost:8080/pic/"+newName10;
        	   System.out.println(time10);
        	   
        	   //save url of picture in database
        	   hostform.setHostFormRole("1");
        	   hostform.setHousePicture(time);
        	   hostform.setPersonPicture(time2);
        	   hostform.setDrawingroomPicture(time3);
        	   hostform.setKitchenPicture(time4);
        	   hostform.setBothroomPicture(time5);
        	   hostform.setBedroomPicture1_1(time6);
        	   hostform.setBedroomPicture1_2(time7);
        	   hostform.setBedroomPicture2_1(time8);
        	   hostform.setBedroomPicture2_2(time9);
        	   
        	   
        	   hostformService.create(hostform);
        	   
        	   
           }
		
		return "success";
	} 
	
	
	@RequestMapping(value=("/host5"),method={RequestMethod.GET,RequestMethod.POST})
	public String doUploadPage2 (@RequestParam("file")MultipartFile file,@RequestParam("file2")MultipartFile file2,@RequestParam("file3")MultipartFile file3,@RequestParam("file4")MultipartFile file4, @RequestParam("file5")MultipartFile file5, @RequestParam("file6")MultipartFile file6, 
			@RequestParam("file7")MultipartFile file7, @RequestParam("file8")MultipartFile file8, @RequestParam("file9")MultipartFile file9, @RequestParam("file10")MultipartFile file10, @RequestBody HostForm hostform)throws IOException{
           if(!file.isEmpty()&&!file2.isEmpty()){
        	   
//        	   Random rand=new Random();
//        	   long random=rand.nextInt();
//        	   String N="T"+System.currentTimeMillis()+random;
//        	   String time ="http://106.14.198.192:8080/pic/"+N;
//        	   System.out.println(time);
        	   
        	   //save picture in server
        	   String newName=System.currentTimeMillis()+file.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName));
        	   String newName2=System.currentTimeMillis()+file2.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file2.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName2));
        	   String newName3=System.currentTimeMillis()+file3.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file3.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName3));
        	   String newName4=System.currentTimeMillis()+file4.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file4.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName4));
        	   String newName5=System.currentTimeMillis()+file5.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file5.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName5));
        	   String newName6=System.currentTimeMillis()+file6.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file6.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName6));
        	   
        	   String newName7=System.currentTimeMillis()+file7.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file7.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName7));
        	   String newName8=System.currentTimeMillis()+file8.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file8.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName8));
        	   String newName9=System.currentTimeMillis()+file9.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file9.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName9));
        	   String newName10=System.currentTimeMillis()+file10.getOriginalFilename();
        	   FileUtils.copyInputStreamToFile(file10.getInputStream(), new File("/Users/zhaomengqi/Desktop/folder_pic",newName10));
        	   
        	   
        	   
        	   //print url of picture form server
        	   String time ="http://localhost:8080/pic/"+newName;
        	   System.out.println(time);
        	   String time2 ="http://localhost:8080/pic/"+newName2;
        	   System.out.println(time2);
        	   String time3 ="http://localhost:8080/pic/"+newName3;
        	   System.out.println(time3);
        	   String time4 ="http://localhost:8080/pic/"+newName4;
        	   System.out.println(time4);
        	   String time5 ="http://localhost:8080/pic/"+newName5;
        	   System.out.println(time5);
        	   
        	   String time6 ="http://localhost:8080/pic/"+newName6;
        	   System.out.println(time6);
        	   String time7 ="http://localhost:8080/pic/"+newName7;
        	   System.out.println(time7);
        	   String time8 ="http://localhost:8080/pic/"+newName8;
        	   System.out.println(time8);
        	   String time9 ="http://localhost:8080/pic/"+newName9;
        	   System.out.println(time9);
        	   String time10 ="http://localhost:8080/pic/"+newName10;
        	   System.out.println(time10);
        	   
        	   //save url of picture in database
        	   hostform.setHostFormRole("1");
        	   hostform.setHousePicture(time);
        	   hostform.setPersonPicture(time2);
        	   hostform.setDrawingroomPicture(time3);
        	   hostform.setKitchenPicture(time4);
        	   hostform.setBothroomPicture(time5);
        	   hostform.setBedroomPicture1_1(time6);
        	   hostform.setBedroomPicture1_2(time7);
        	   hostform.setBedroomPicture2_1(time8);
        	   hostform.setBedroomPicture2_2(time9);
        	   
        	   
        	   hostformService.create(hostform);
        	   
        	   
           }
		
		return "success";
	} 
	
	
	//天一，后管系统的住家申请列表url
	@RequestMapping(value="/apply",method=RequestMethod.GET)
	public String apply(Map<String,Object> map){
		map.put("applyHostList",applyHostServic.findRole());
		return "form/apply";
	}
	
	@RequestMapping(value = "/details/{hostFormId}",method=RequestMethod.GET)
	public String details(@PathVariable("hostFormId") Long hostFormId,Map<String,Object> map){
		HostForm hosti = hostformService.find(hostFormId);
		map.put("HostFormId", hosti.getHostFormId());
		map.put("HostFormRole", hosti.getHostFormRole());
		map.put("KeyValue", hosti.getKeyValue());
		map.put("FirstName", hosti.getFirstName());
		map.put("MiddleName", hosti.getMiddleName());
		map.put("LastName", hosti.getLastName());
		map.put("Title", hosti.getTitle());
		map.put("Age", hosti.getAge());
		map.put("MaritalStatus", hosti.getMaritalStatus());
		map.put("Occupation", hosti.getOccupation());
		map.put("Cellphone", hosti.getCellphone());
		map.put("Email", hosti.getEmail());
		map.put("WayOfService", hosti.getWayOfService());
		map.put("Country", hosti.getCountry());
		map.put("Address", hosti.getAddress());
		map.put("City", hosti.getCity());
		map.put("State", hosti.getState());
		map.put("ZipCode", hosti.getZipCode());
		map.put("Hosptial", hosti.getHosptial());
		map.put("Supermarket", hosti.getSupermarket());
		map.put("Highschool", hosti.getHighschool());
		map.put("SubwayStation", hosti.getSubwayStation());
		map.put("University", hosti.getUniversity());
		map.put("BusStation", hosti.getBusStation());
		map.put("Wifi", hosti.getWifi());
		map.put("Transportation", hosti.getTransportation());
		map.put("Washhouse", hosti.getWashhouse());
		map.put("Breakfast",hosti.getBreakfast());
		map.put("Lunch",hosti.getLunch());
		map.put("Dinner",hosti.getDinner());
		map.put("FamilyMember1", hosti.getFamilyMember1());
		map.put("Age1", hosti.getAge1());
		map.put("Sex1", hosti.getSex1());
		map.put("Occupation1", hosti.getOccupation1());
		map.put("FamilyMember2", hosti.getFamilyMember2());
		map.put("Age2", hosti.getAge2());
		map.put("Sex2", hosti.getSex2());
		map.put("Occupation2", hosti.getOccupation2());
		map.put("FamilyMember3", hosti.getFamilyMember3());
		map.put("Age3", hosti.getAge3());
		map.put("Sex3", hosti.getSex3());
		map.put("Occupation3", hosti.getOccupation3());
		map.put("FamilyMember4", hosti.getFamilyMember4());
		map.put("Age4", hosti.getAge4());
		map.put("Sex4", hosti.getSex4());
		map.put("Occupation4", hosti.getOccupation4());
		map.put("Introducation", hosti.getIntroducation());
		map.put("Preferhost", hosti.getPreferhost());
		map.put("Religious", hosti.getReligious());
		map.put("Pets", hosti.getPets());
		map.put("PersonPicture", hosti.getPersonPicture());
		map.put("DrawingroomPicture", hosti.getDrawingroomPicture());
		map.put("KitchenPicture", hosti.getKitchenPicture());
		map.put("BothroomPicture", hosti.getBothroomPicture());
		map.put("BedroomPicture1_1", hosti.getBedroomPicture1_1());
		map.put("BedroomPicture1_2", hosti.getBedroomPicture1_2());
		map.put("P1Price",hosti.getP1Price());
		map.put("P1ShortTermStartTime", hosti.getP1ShortTermStartTime());
		map.put("P1ShortTermLeftTime", hosti.getP1ShortTermLeftTime());
//		map.put("P1LongTermStartTime", hosti.getP1LongTermStartTime());
//		map.put("P1LongTermLeftTime", hosti.getP1LongTermLeftTime());
		map.put("BedroomPicture2_1", hosti.getBedroomPicture2_1());
		map.put("BedroomPicture2_2", hosti.getBedroomPicture2_2());
		map.put("P2Price",hosti.getP2Price());
		map.put("P2ShortTermStartTime", hosti.getP2ShortTermStartTime());
		map.put("P2ShortTermLeftTime", hosti.getP2ShortTermLeftTime());
//		map.put("P2LongTermStartTime", hosti.getP2LongTermStartTime());
//		map.put("P2LongTermLeftTime", hosti.getP2LongTermLeftTime());
		map.put("BedroomPicture3_1", hosti.getBedroomPicture3_1());
		map.put("BedroomPicture3_2", hosti.getBedroomPicture3_2());
		map.put("P3ShortTermStartTime", hosti.getP3ShortTermStartTime());
		map.put("P3ShortTermLeftTime", hosti.getP3ShortTermLeftTime());
		map.put("P3Price",hosti.getP3Price());
//		map.put("P3LongTermStartTime", hosti.getP3LongTermStartTime());
//		map.put("P3LongTermLeftTime", hosti.getP3LongTermLeftTime());
		map.put("BedroomPicture4_1", hosti.getBedroomPicture4_1());
		map.put("BedroomPicture4_2", hosti.getBedroomPicture4_2());
		map.put("P4Price",hosti.getP4Price());
		map.put("P4ShortTermStartTime", hosti.getP4ShortTermStartTime());
		map.put("P4ShortTermLeftTime", hosti.getP4ShortTermLeftTime());
//		map.put("P4LongTermStartTime", hosti.getP4LongTermStartTime());
//		map.put("P4LongTermLeftTime", hosti.getP4LongTermLeftTime());
		map.put("BedroomPicture5_1", hosti.getBedroomPicture5_1());
		map.put("BedroomPicture5_2", hosti.getBedroomPicture5_2());
		map.put("P5Price",hosti.getP5Price());
		map.put("P5ShortTermStartTime", hosti.getP5ShortTermStartTime());
		map.put("P5ShortTermLeftTime", hosti.getP5ShortTermLeftTime());
//		map.put("P5LongTermStartTime", hosti.getP5LongTermStartTime());
//		map.put("P5LongTermLeftTime", hosti.getP5LongTermLeftTime());
		map.put("BedroomPicture6_1", hosti.getBedroomPicture6_1());
		map.put("BedroomPicture6_2", hosti.getBedroomPicture6_2());
		map.put("P6Price",hosti.getP6Price());
		map.put("P6ShortTermStartTime", hosti.getP6ShortTermStartTime());
		map.put("P6ShortTermLeftTime", hosti.getP6ShortTermLeftTime());
//		map.put("P6LongTermStartTime", hosti.getP6LongTermStartTime());
//		map.put("P6LongTermLeftTime", hosti.getP6LongTermLeftTime());
		map.put("BedroomPicture7_1", hosti.getBedroomPicture7_1());
		map.put("BedroomPicture7_2", hosti.getBedroomPicture7_2());
		map.put("P7Price",hosti.getP7Price());
		map.put("P7ShortTermStartTime", hosti.getP7ShortTermStartTime());
		map.put("P7ShortTermLeftTime", hosti.getP7ShortTermLeftTime());
//		map.put("P7LongTermStartTime", hosti.getP7LongTermStartTime());
//		map.put("P7LongTermLeftTime", hosti.getP7LongTermLeftTime());
		map.put("BedroomPicture8_1", hosti.getBedroomPicture8_1());
		map.put("BedroomPicture8_2", hosti.getBedroomPicture8_2());
		map.put("P8Price",hosti.getP8Price());
		map.put("P8ShortTermStartTime", hosti.getP8ShortTermStartTime());
		map.put("P8ShortTermLeftTime", hosti.getP8ShortTermLeftTime());
//		map.put("P8LongTermStartTime", hosti.getP8LongTermStartTime());
//		map.put("P8LongTermLeftTime", hosti.getP8LongTermLeftTime());
		map.put("BedroomPicture9_1", hosti.getBedroomPicture9_1());
		map.put("BedroomPicture9_2", hosti.getBedroomPicture9_2());
		map.put("P9Price",hosti.getP9Price());
		map.put("P9ShortTermStartTime", hosti.getP9ShortTermStartTime());
		map.put("P9ShortTermLeftTime", hosti.getP9ShortTermLeftTime());
//		map.put("P9LongTermStartTime", hosti.getP9LongTermStartTime());
//		map.put("P9LongTermLeftTime", hosti.getP9LongTermLeftTime());
		map.put("BedroomPicture10_1", hosti.getBedroomPicture10_1());
		map.put("BedroomPicture10_2", hosti.getBedroomPicture10_2());
		map.put("P10Price",hosti.getP10Price());
		map.put("P10ShortTermStartTime", hosti.getP10ShortTermStartTime());
		map.put("P10ShortTermLeftTime", hosti.getP10ShortTermLeftTime());
//		map.put("P10LongTermStartTime", hosti.getP10LongTermStartTime());
//		map.put("P10LongTermLeftTime", hosti.getP10LongTermLeftTime());
		return "form/details";
		
	}
	
	@RequestMapping(value="/reject/{hostFormId}",method=RequestMethod.GET)
	public String reject(@PathVariable("hostFormId") Long hostFormId, Map<String,Object> map){
		
		HostForm host = hostformService.find(hostFormId);
		host.setHostFormRole("2");
		hostformService.update(host);
		applyHostServic.delete(hostFormId);
		return "redirect:/form/apply";
	}
	
	@RequestMapping(value="/authorize/{hostFormId}",method=RequestMethod.GET)
	public String authorize(@PathVariable("hostFormId") Long hostFormId, Map<String,Object> map){
		
		HostForm host = hostformService.find(hostFormId);
		host.setHostFormRole("3");
		hostformService.update(host);
		applyHostServic.delete(hostFormId);
		return "redirect:/form/apply";
	}
	
	@RequestMapping(value="/editprice",method=RequestMethod.POST)
	public String editprice(@PathVariable("hostFormId") Long hostFormId, Map<String,Object> map){
		HostForm host = hostformService.find(hostFormId);
		map.put("P1Price", host.getP1Price());
		return "form/editprice1";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(HostForm host, Map<String,Object> map){
		hostformService.update(host);
		return "redirect:/form/details/" + host.getHostFormId();
	}
	
	//首页金牌住家点击更多接口
	@RequestMapping(value="/more",method=RequestMethod.GET)
	public @ResponseBody List<HostForm> getGold(){
		return  hostformService.findGold();
	}
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public @ResponseBody List<HostForm> getGoldHost(){
		return  hostformService.findGold();
	}
	//
}
