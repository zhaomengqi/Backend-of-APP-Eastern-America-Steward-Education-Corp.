package com.ease.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ease.model.Event;
import com.ease.servic.EventServic;

@Controller
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventServic eventService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET) 
	public String register(Map<String,Object> map){
		map.put("event", new Event());
		return "/event/add";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST) 
	public String create(@Valid @ModelAttribute("event") Event event, BindingResult result,Map<String,Object> map){
		eventService.create(event);
		return "redirect:/event/edit/" + event.getEventId();
	}
	
	@RequestMapping(value = "/details/{eventId}",method=RequestMethod.GET)
	public String details(@PathVariable("eventId") Long eventId,Map<String,Object> map){
		Event event = eventService.find(eventId);
		map.put("EventId", event.getEventId());
		map.put("EventName", event.getEventName());
		map.put("EventContent", event.getEventContent());
		return "event/details";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Map<String,Object> map){
		map.put("eventList", eventService.getAll());
		return "event/list";
	}
	
	@RequestMapping(value="/edit/{eventId}",method=RequestMethod.GET)
	public String edit(@PathVariable("eventId") Long eventId, Map<String,Object> map){
		Event event = eventService.find(eventId);
		map.put("event", event);
		return "event/edit";
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(Event event, Map<String,Object> map){
		eventService.update(event);
		return "redirect:/event/edit/" + event.getEventId();
	}
	
	@RequestMapping(value="/delete/{eventId}",method=RequestMethod.GET)
	public String delete(@PathVariable("eventId") Long eventId, Map<String,Object> map){
		eventService.delete(eventId);
		return "redirect:/event/list";
	}
	
	@RequestMapping(value="/{eventId}",method=RequestMethod.GET)
	public @ResponseBody Event getUserInJson(@PathVariable("eventId") Long eventId){
		return  eventService.find(eventId);
	}
	
}
