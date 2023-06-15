package com.withoutDB.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.withoutDB.Entity.Friend;
import com.withoutDB.Service.FriendService;

@RestController

public class Controller {

	@Autowired
	FriendService service;

	@PostMapping("add")
	public String saveFriend(@RequestBody Friend friend) {
		String msg = null;
		boolean ifExist = service.saveFriend(friend);
		if (ifExist) {
			msg = "friend added";
		} else {
			msg = "already exist";
		}
		return msg;
	}

	@GetMapping("getAll")
	public Object getAllFriend() {
		Object allFriend = service.getAllFriend();
		return allFriend;
	}

	@GetMapping("get/{id}")
	public Object getDataId(@PathVariable Long id) {
		Friend friendById = service.getFriendById(id);
		if (friendById != null) {
			return friendById;
		} else {
			return "no friend for given id";
		}
	}
	
	@GetMapping("count")
	public Integer getCount() {
		Integer count = service.getCount();
		return count;
	}
	
	@GetMapping("sortByID")
	public List<Friend> sortFriendbyId(){
		List<Friend> sortFriendById = service.sortFriendById();
		return sortFriendById;		
	}
	
	@GetMapping("sortByName")
	public List<Friend> sortFriendbyName(){
		List<Friend> sortFriendByName = service.sortFriendByName();
		return sortFriendByName;		
	}

	@PutMapping("put")
	public String updateData(@RequestBody Friend friend) {		
		boolean updateFriend = service.updateFriend(friend);
		if(updateFriend) {
			return "updated";
		}
		else {
			return "not updated";
		}
		}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		
		boolean deleteFriendById = service.deleteFriendById(id);
		if(deleteFriendById) {
			return "delete";
		}
		else {
			return "not delete";
		}
		
		
		
	}
}
